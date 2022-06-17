import java.util.*;

public class QuickSort
{
    static public void quick_sort(int[] arr,int lb,int ub)
    {
        if(lb<ub)
        {
            int i = lb;
            int pivot = arr[ub];
            for(int j= lb;j<ub;j++) {
                if (arr[j] <= pivot) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
            }
                int temp1 = arr[i];
                arr[i] = arr[ub];
                arr[ub] = temp1;
                int pi = i;
                quick_sort(arr, lb, pi - 1);
                quick_sort(arr, pi + 1, ub);
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
        quick_sort(arr,0,arr.length-1);
        System.out.print("Sorted Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
