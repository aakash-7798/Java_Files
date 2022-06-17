import java.util.*;
public class SelectionSort_Strings {
    static public int GetArrayIndex(String[] arr, String key)
    {
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(key))
            {
                index = i;
                break;
            }
        }
        return index;
    }
    static public void selection_sort(String arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++)
        {
            String min_ele = arr[i];
            for(int j=i+1;j<len;j++)
            {
                if(min_ele.compareTo(arr[j])>0)
                {
                    min_ele = arr[j];
                }
                int idx = GetArrayIndex(arr,min_ele);
                String temp = arr[idx];
                arr[idx] = arr[i];
                arr[i]= temp;
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
        selection_sort(arr);
        System.out.print("Sorted Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
