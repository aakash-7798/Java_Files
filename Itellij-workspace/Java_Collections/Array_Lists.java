import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_Lists {
    public static void main(String args[])
    {
        ArrayList<Integer> Al = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            Al.add(i);
        }
        ArrayList<Integer> Al1 = new ArrayList<>();
        for(int i=12;i<=20;i++)
        {
            Al1.add(i);
        }
        ArrayList<Integer> Al2 = Al;
        System.out.print("Elements Just Added With For Loop (Al): "+Al+"\n");
        Al.add(10,11);
        System.out.print("Element Added with the help of Index : "+Al+"\n");
        System.out.print("Elements Just Added With For Loop (Al1): "+Al1+"\n");
        Al.addAll(Al1);
        System.out.print("Element Added with the help of Add_all : "+Al+"\n");
        System.out.println("Checking Whether the Specified Element is Present in the List : "+Al.contains(17));
        System.out.print("For Each Method : ");
        Al1.forEach(n -> System.out.print(n+" "));
        System.out.print("\n"+"Fetching Specified Element Index : "+Al.indexOf(2));
        System.out.print("\n"+"Fetching Element from Index : "+Al.get(15));
        Al2.addAll(Al);
        Al2.addAll(Al1);
        System.out.print("\n"+"New Array List : "+Al2);
        System.out.print("\n"+"Last Occurence of Particular Element : "+Al.lastIndexOf(1));
        System.out.print("\n"+"Set Element At Particular Index : "+Al1.set(8,19));
        System.out.print("\nList Elements ->"+Al1);
//        System.out.print("\n"+"List Iterator: ");
        ListIterator<Integer> LI = Al1.listIterator(Al1.size());
        System.out.print("\n"+"List Iterator Previous: ");
        while (LI.hasPrevious()){
            System.out.print("\n"+"Value is : "+LI.previous());
        }
//        while (LI.hasNext())
//        {
//            System.out.print("\n"+"Value is : "+LI.next());
//        }
        List<Integer> sub_list = Al.subList(12,18);
        System.out.print("\n"+"Sublist : "+sub_list);
        System.out.print("\n"+"TrimToSize : ");
        Al1.trimToSize();
        Al1.add(20);
        System.out.print("\n"+Al1);
    }
}
