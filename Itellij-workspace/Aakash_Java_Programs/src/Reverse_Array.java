import java.util.*;
public class Reverse_Array {
    public static void reverse_array(int[] arr)
    {
        int len = arr.length-1;
        int[] arr1= new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            arr1[i] = arr[len];
            len--;
        }
//        System.out.println(" ");
        System.out.print("Reversed Array : ");
        for(Object var:arr1)
        {
            System.out.print(var+" ");
        }
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
        reverse_array(a);
    }
}
