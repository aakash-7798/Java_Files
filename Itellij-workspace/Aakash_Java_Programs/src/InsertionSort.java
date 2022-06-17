import java.util.Scanner;

public class InsertionSort {
    static public void insertion_sort(int[] arr)
    {
        for(int i=1;i< arr.length;i++)
        {
            int j=i-1;
            while(j>=0)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j--;
            }
        }
    }
    static public void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("How Many Elements you want to Consider : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        insertion_sort(arr);
        System.out.print("Sorted Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
