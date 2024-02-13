public class Tricks {

  
    public static void clearScreen(){
        System.out.println("\033[H\033[2J");
    }

    //Circle through an Array
    
    public static String howMuchILoveYou (int nb_petals){
    
        String[] stringArr =  new String[6];

        stringArr[0] = "I love you";
        stringArr[1] = "a little";
        stringArr[2] = "a lot";
        stringArr[3] = "passionately";
        stringArr[4]  = "madly";
        stringArr[5] = "not at all";

        int mod = 6;

        //!formula to find the correct index= n%array.lenght
        int index = nb_petals%mod;
        
        if (nb_petals%6 == 0) {
            index+=6;
        }

        return stringArr[index-1];
        }
    
}
