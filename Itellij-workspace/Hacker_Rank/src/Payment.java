import java.text.NumberFormat;
import java.util.*;

public class Payment {
    public static void main(String[] args)
    {
//        Set<Currency> cur = Currency.getAvailableCurrencies();
//        Currency usa_cur = Currency.getInstance("USD");
////        Currency china_cur = Currency.getInstance("C");
//        System.out.print(usa_cur.getSymbol());
//        System.out.print(cur);
        Scanner s = new Scanner(System.in);
        double payment = s.nextDouble();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String ind = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String chn = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String frn = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: "+us);
//        System.out.println("India: "+ind.replace("₹","Rs."));
        System.out.println("India: "+"Rs."+ind.substring(1,ind.length()));
        System.out.println("China: "+chn);
        System.out.println("France: "+frn);
    }
}

//12324.134