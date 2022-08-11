import java.util.*;

public class QuickSort_Strings
{
    public static void quick_sort(String[] arr,int lb,int ub)
    {
        if(lb<ub)
        {
            int i = lb;
            String pivot = arr[ub];
            for(int j= lb;j<ub;j++) {
                if (arr[j].compareTo(pivot)<=0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
            }
            String temp1 = arr[i];
            arr[i] = arr[ub];
            arr[ub] = temp1;
            int pi = i;
            quick_sort(arr, lb, pi - 1);
            quick_sort(arr, pi + 1, ub);
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
        quick_sort(arr,0,arr.length-1);
        System.out.print("Sorted Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
