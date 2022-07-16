import java.util.*;
public class CountOfSmallerNumberAfterSelf {
    public static void count_of_smaller_number_after_self(int[] a)
    {
        int[] otpt = new int[a.length];
        for(int i = 0;i<a.length;i++)
        {
            int ct = 0;
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    ct++;
                }
            }
            otpt[i] = ct;
        }
        System.out.print("Count of Smaller Elements After Self : ");
        for(int i=0;i<otpt.length;i++)
        {
            System.out.print(otpt[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many elements you want to consider : ");
        int ele = s.nextInt();
        int[] a = new int[ele];
        System.out.print("Enter Elements : ");
        for(int i=0;i<ele;i++)
        {
            a[i]= s.nextInt();
        }
//        System.out.print("Array Elements : ");
//        for(int i=0;i<ele;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
        count_of_smaller_number_after_self(a);
    }
}
