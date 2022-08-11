
//  Written By Aakash Nadupalli

//10. Write a Java program that implements merge sort for sorting a list of names in ascending order.

public class Program_10 {
    static String[] arr;
    public static void merge(int lb,int mid,int ub)
    {
        String[] left = new String[mid-lb+1];
        String[] right = new String[ub-mid];
        for (int i = 0; i < left.length; ++i)
        {
            left[i] = arr[lb + i];
        }
        for (int j = 0; j < right.length; ++j)
        {
            right[j] = arr[mid + 1 + j];
        }
        int i=0,j=0,k=lb;
        while(i<left.length && j< right.length)
        {
            if(left[i].compareTo(right[j])<0)
            {
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j< right.length)
        {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
    public static void merge_sort(int lb,int ub)
    {
        if(lb<ub)
        {
            int mid = (lb+ub)/2;
            merge_sort(lb,mid);
            merge_sort(mid+1,ub);
            merge(lb,mid,ub);
        }
    }
    public static void main(String[] args) {
        arr = new String[]{"abcd","edsre","gdfgd","yujhgfgf","fhyhf","xcdsf","trrrg","ioput"};
        System.out.print("Unsorted List = ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        merge_sort(0, arr.length-1);
        System.out.print("Sorted List = ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
