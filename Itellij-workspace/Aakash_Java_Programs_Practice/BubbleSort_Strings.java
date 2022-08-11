import java.util.*;
public class BubbleSort_Strings {
    static public void bubble_sort(String[] arr)
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static public void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("How Many Strings you want to Consider : ");
        int n = s.nextInt();
        String[] arr = new String[n];
        System.out.print("Enter Strings  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.next();
        }
        bubble_sort(arr);
        System.out.print("Sorted Elements : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

