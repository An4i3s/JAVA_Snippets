
import java.time.*;
/*
 * LocalDate Class
 is a class for storing and managing a date, with a year, month and day, without reference to a specific time zone. 
 Used for anniversary, special Holidays...
* Multiple ways of creating LocalDates
LocalDate.of(year,month,dayOfMonth) - you can use ENUM Values for Month (Month.MAYs)
LocalDate.ofYearDay(year, dayOfYear)
LocalDate.parse(String "2022-05-05")
 */

public class FormattaData {
    
 
    public LocalDate getDateFromString(String data){
        LocalDate formDate = LocalDate.parse(data);
        return formDate;
    }

    //metodi get
    //System.out.println(d.getDayOfWeek()+" "+d);
    


    
}


    

