import java.util.*;

public class InsertionSort_Strings {
    static public void insertion_sort(String[] arr)
    {
        for(int i=1;i< arr.length;i++)
        {
            int j=i-1;
            while(j>=0)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j--;
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
        insertion_sort(arr);
        System.out.print("Sorted Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

