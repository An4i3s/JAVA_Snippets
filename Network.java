import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import lib.*;

public class Network {

    
    public void getIndirizziIP() {


        String dom="www.libero.it";
        try {
        InetAddress loc=InetAddress.getByName(dom);
        System.out.println("IP di "+dom+" : "+loc.getHostAddress());
        }
        catch (UnknownHostException e)
        {System.out.println("Dominio non esiste "+dom);};
        try {
        InetAddress loc=InetAddress.getLocalHost();
        System.out.println("IP locale: "+loc.getHostAddress());
        System.out.println("Nome locale"+loc.getHostName());
        }
        catch (UnknownHostException e)
        {};

    }

    public void getAttributiHeader(){
        try {
        URL u = new URL("http://www.example.com/");
        URLConnection uc = u.openConnection();
        uc.connect();
        String key=null;
        for (int n = 1;
            (key=uc.getHeaderFieldKey(n)) != null;
            n++) {
        System.out.println(key + ": " + uc.getHeaderField(key));
        }
        }
        catch (IOException e) {
        System.err.println(e);
}
    }

    public void gestireRichiesteHTTP(){
        try {
            //richiedere un servizio si usa il seguente snippet
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet get=new HttpGet("http://www.example.com");
            InputStream is;
            CloseableHttpResponse response= httpclient.execute(get);
            is = response.getEntity().getContent();

            //Per gestire la risposta ottenuta dalla richiesta
            BufferedReader r=new BufferedReader(new InputStreamReader(is));
            String s=null;
            StringBuffer sb=new StringBuffer();
            while((s=r.readLine())!=null) {
                sb.append(s);
                
                System.out.println(s);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void downloadFromUrl(URL url, String localFilename, String userAgent) throws IOException {
        InputStream is = null;
        FileOutputStream fos = null;
            try {
            URLConnection urlConn = url.openConnection();
            if (userAgent != null)
            urlConn.setRequestProperty("User-Agent", userAgent);
            is = urlConn.getInputStream();
            fos = new FileOutputStream(localFilename);
            byte[] buffer = new byte[4096];
            int len;
            while ((len = is.read(buffer)) > 0)
            fos.write(buffer, 0, len);
        }
        finally { if (is != null && fos != null) { is.close(); fos.close(); } }
        }
}
