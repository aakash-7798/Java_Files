import  java.util.*;
import java.math.BigDecimal;
public class BigDecimalJava {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int input= s.nextInt();
//        double arr[]= new double[input] ;
//        for(int i=0;i<input;i++)
//        {
//            arr[i] = s.nextDouble();
//        }
//        System.out.print("Elements Before Sorting : ");
//        for(int i=0;i<input;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        Arrays.sort(arr);
//        System.out.print("\nElements After Sorting (Descending) : ");
//        for(int i=input-1;i>=0;i--)
//        {
//            System.out.print(arr[i]+" ");
//        }
        BigDecimal[] arr = new BigDecimal[input];

        for(int i=0;i<input;i++)
        {
            arr[i] = s.nextBigDecimal();
        }
        System.out.print("Elements Before Sorting : ");
        for(int i=0;i<input;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.print("\nElements After Sorting (Descending) : ");
        for(int i=input-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
//9
//-100
//50
//0
//56.6
//90
//0.12
//.12
//02.34
//000.000