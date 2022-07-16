import java.util.*;
import java.text.DateFormatSymbols;
public class getDay {
    public static void main(String args[])
    {
        String[] day_names = new DateFormatSymbols().getWeekdays();
        Calendar cld = new GregorianCalendar(2017,7,14);
        int day = cld.get(Calendar.DAY_OF_WEEK);
        System.out.print(day_names[day].toUpperCase());
//        for(String i:daynames){System.out.print(i+" ");}
    }

}
