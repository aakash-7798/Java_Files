import java.util.*;
public class AppropriateDataType {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        List<String> lst = new ArrayList<>();
        int tst = s.nextInt();
        for(int i=0;i<tst;i++)
        {
             try{
                 long lg = s.nextLong();
                 System.out.println(lg+" can be fitted in:");
                 if(lg>=Byte.MIN_VALUE&&lg<=Byte.MAX_VALUE)
                 {
                     System.out.println("* byte");
                 }
                 if(lg>=Short.MIN_VALUE&&lg<=Short.MAX_VALUE)
                 {
                     System.out.println("* short");
                 }
                 if(lg>=Integer.MIN_VALUE&&lg<=Integer.MAX_VALUE)
                 {
                     System.out.println("* int");
                 }
                 if(lg>=Long.MIN_VALUE&&lg<=Long.MAX_VALUE)
                 {
                     System.out.println("* long");
                 }
             }
             catch (Exception e){System.out.println(s.next()+" can't be fitted anywhere.");}
        }
        s.close();
    }
}
//5
//        -150
//        150000
//        1500000000
//        213333333333333333333333333333333333
//        -100000000000000
