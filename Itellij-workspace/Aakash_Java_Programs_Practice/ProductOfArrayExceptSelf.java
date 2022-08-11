import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static int product_of_array_except_self(int[] a,int key)
    {
        int pd = 1;
        for(int i=0;i<a.length;i++)
        {
            if(i==key)
            {
                continue;
            }
            pd*=(a[i]);
        }
        return pd;
//        System.out.println("Product : "+pd);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many elements you want to consider : ");
        int ele = s.nextInt();
        int[] a = new int[ele];
        System.out.print("Enter elements : ");
        for(int i=0;i<ele;i++)
        {
            a[i] = s.nextInt();
        }
        List<Integer> lst = new ArrayList<>(ele);
        for(int i=0;i<ele;i++)
        {
            lst.add(product_of_array_except_self(a,i));
        }
        System.out.print("Product of Array Except Self : "+lst);

    }
}
