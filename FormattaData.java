
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
    
  
           Calendar day1 = calendar;
        String day1String = formatCalendarDate(day1);
        Calendar day2 = (Calendar) calendar.clone();
        day2.add(Calendar.DAY_OF_MONTH, 1);
        String day2String = formatCalendarDate(day2);
        Calendar day3 = (Calendar) calendar.clone();
        day3.add(Calendar.DAY_OF_MONTH, 2);
        String day3String = formatCalendarDate(day3);
        Calendar day4 = (Calendar) calendar.clone();
        day4.add(Calendar.DAY_OF_MONTH, 3);
        Calendar day5 = (Calendar) calendar.clone();
        day5.add(Calendar.DAY_OF_MONTH, 4);
        Calendar day6 = (Calendar) calendar.clone();
        day6.add(Calendar.DAY_OF_MONTH, 5);
        Calendar day7 = (Calendar) calendar.clone();
        day7.add(Calendar.DAY_OF_MONTH, 6);

    
}


    

