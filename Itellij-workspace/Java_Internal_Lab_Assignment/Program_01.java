
//  Written By Aakash Nadupalli

//1. Write a Java program to perform the following:
//        i)Sort a list of integers in ascending order using Bubble sort.
//        ii)Then searches for a key value(integer) non recursively in the above sorted list
//        using Binary search.

public class Program_01 {
    public static int[] bubble_sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j< a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int binary_search(int[] arr,int key)
    {
        int [] a = bubble_sort(arr);
        int lb = 0,ub = a.length-1;
        while(lb<=ub)
        {
            int mid = lb+(ub-lb)/2;
            if(a[mid]==key)
                 {
                     return mid;
                 }
            else if (key<a[mid])
            {
                ub = mid-1;
            }
            else
            {
                lb = mid+1;
            }
        }
        return -1;
    }

    public static void print_array(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {5,7,4,2,1,76,43,23,45,12,32,46};
        System.out.print("Unsorted Elements -> ");
        print_array(a);
        System.out.print("Sorted Elements -> ");
        int[] a_new = bubble_sort(a);
        print_array(a_new);
        int idx = binary_search(a,12);
        if(idx==-1){System.out.print("Element Not Found...");}
        else{System.out.print("Element Found at Index -> "+idx);}

    }
}
