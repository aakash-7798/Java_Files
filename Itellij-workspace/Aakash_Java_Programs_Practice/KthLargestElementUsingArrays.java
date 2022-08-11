import java.util.*;
public class KthLargestElementUsingArrays {
    public static void sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        // System.out.print("Sorted Elements : ");
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
    }
    public static void kth_largest_element(int[] a,int lar)
    {
        sort(a);
        int max_ele = a[lar];
        for(int i=lar;i<a.length;i++)
        {
            if(max_ele<a[i]) {
                max_ele = a[i];
            }
        }
        System.out.print("Maximum Element in Array : "+max_ele);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many elements you want to consider : ");
        int ele = s.nextInt();
        int a[] = new int[ele];
        System.out.print("Enter elements  : ");
        for(int i=0;i<ele;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Which largest element you want to find  : ");
        int lar = s.nextInt();
        kth_largest_element(a,lar-1);

    }
}
