import java.util.*;
import java.util.concurrent.TimeUnit;

public class BubbleSort {
    static public void bubble_sort(int[] arr)
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static public void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How Many Elements you want to Consider : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements  : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        bubble_sort(arr);
        System.out.print("Sorted Elements : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
