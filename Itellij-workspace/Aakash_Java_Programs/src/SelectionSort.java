import java.util.*;
public class SelectionSort {
    static public int GetArrayIndex(int[] arr, int key)
    {
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                index = i;
                break;
            }
        }
        return index;
    }
    static public void selection_sort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++)
        {
            int min_ele = arr[i];
            for(int j=i+1;j<len;j++)
            {
                if(min_ele>arr[j])
                {
                    min_ele = arr[j];
                }
                int idx = GetArrayIndex(arr,min_ele);
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i]= temp;
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
        selection_sort(arr);
        System.out.print("Sorted Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
