import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    
    public void formattaData(String inputData) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date data = dateFormat.parse(inputData);
        String dataInString = dateFormat.format(data);
        System.out.println("La data è "+dataInString);
    }
}
