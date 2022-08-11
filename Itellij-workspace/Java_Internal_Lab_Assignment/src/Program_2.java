
//  Written By Aakash Nadupalli

//2. Write a Java program to perform the following:
//        i)Sort a list of integers in ascending order using Insertion sort.
//        ii)Then searches for a key value(integer) non recursively in the above sorted list
//        using Binary search.

public class Program_2 {
    public static int[] insertion_sort(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            int j=i-1;
            {
                while (j>=0)
                {
                    if(a[j]>a[j+1])
                     {
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                   }
                    j--;
                }
            }
        }
        return a;
    }

    public static int binary_search(int[] arr,int key)
    {
        int [] a = insertion_sort(arr);
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
        int a[] = {2, 25, 8, 9, 7, 8, 2, 1, 5, 8, 33, 5, 58, 35, 69, 8, 7, 56, 23, 21, 25, 44, 66, 78, 98};
        System.out.print("Unsorted Elements -> ");
        print_array(a);
        System.out.print("Sorted Elements -> ");
        int[] a_new = insertion_sort(a);
        print_array(a_new);
        int idx = binary_search(a,21);
        if(idx==-1){System.out.print("Element Not Found...");}
        else{System.out.print("Element Found at Index -> "+idx);}

    }
}
