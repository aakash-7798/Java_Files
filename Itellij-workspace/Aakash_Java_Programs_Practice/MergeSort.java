import java.util.Scanner;

public class MergeSort {
    static int[] arr;
    static public void merge(int lb,int mid,int ub)
    {
        int a1= mid-lb+1;
        int a2=ub-mid;
        int arr1[] = new int[a1];
        int arr2[] = new int[a2];
        for (int i = 0; i < a1; ++i)
        {
            arr1[i] = arr[lb + i];
        }
        for (int j = 0; j < a2; ++j)
        {
            arr2[j] = arr[mid + 1 + j];
        }
        int i=0,j=0,k=lb;
        while(i< a1 && j< a2)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k] = arr1[i];
                i++;
            }
            else
            {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i< a1)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j< a2)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    static public void merge_sort(int lb,int ub)
    {
        if(lb<ub) {
            int mid = (lb + ub) / 2;
            merge_sort(lb, mid);
            merge_sort(mid + 1, ub);
            merge(lb, mid, ub);
        }
    }
    static public void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("How Many Elements you want to Consider : ");
        int n = s.nextInt();
        arr = new int[n];
        System.out.print("Enter Elements  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        merge_sort(0, arr.length-1);
        System.out.print("Sorted Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
