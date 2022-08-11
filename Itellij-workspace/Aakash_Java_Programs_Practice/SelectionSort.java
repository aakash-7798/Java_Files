import java.util.*;
public class SelectionSort {
    static public void selection_sort(int a[]) {
        for(int i=0;i<a.length;i++)
        {
            int m_id = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[m_id]>a[j])
                {
                    m_id = j;
                }
            }
            int temp = a[m_id];
            a[m_id] = a[i];
            a[i] = temp;
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
