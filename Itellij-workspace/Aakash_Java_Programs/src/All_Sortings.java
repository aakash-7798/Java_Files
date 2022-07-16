import java.util.*;
public class All_Sortings {
    public static void print_array(int[] a)
    {
        for(int i=0;i< a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
    }
    public static void bubble_sort(int[] arr)
    {
        int[] a = new int[arr.length];
        for(int ar=0;ar<arr.length;ar++)
        {
            a[ar] = arr[ar];
        }

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
        System.out.println(" ");
        System.out.print("Sorting Using Bubble Sort    : ");
        print_array(a);
    }

    public static void selection_sort(int[] arr)
    {
        int[] a = new int[arr.length];
        for(int ar=0;ar<arr.length;ar++)
        {
            a[ar] = arr[ar];
        }
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
        System.out.print("Sorting Using Selection Sort : ");
        print_array(a);
    }

    public static void insertion_sort(int[] arr)
    {
        int[] a = new int[arr.length];
        for(int ar=0;ar<arr.length;ar++)
        {
            a[ar] = arr[ar];
        }

        for(int i =1;i<a.length;i++)
        {
            int j = i-1;
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

        System.out.print("Sorting Using Insertion Sort : ");
        print_array(a);


    }

    public static void quick_sort(int[] a,int lb,int ub)
    {
        if(lb<ub)
        {
            int i = lb;
            int pivot = a[ub];
            for (int j = lb; j < ub; j++)
            {
                if (a[j] <= pivot)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                }

            }
            int temp1 = a[i];
            a[i] = a[ub];
            a[ub] = temp1;
            int pi = i;
            quick_sort(a,lb,pi-1);
            quick_sort(a,pi+1,ub);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many elements you want to consider : ");
        int ele = s.nextInt();
        int a[]= new int[ele];
        System.out.print("Enter Elements : ");
        for(int i=0;i<ele;i++)
        {
            a[i] = s.nextInt();
        }
        long b_start = System.currentTimeMillis();
        bubble_sort(a);
        long b_end = System.currentTimeMillis();
        System.out.println("Bubble Sort Execution Time    : "+(b_end-b_start)+"ms");
        System.out.print("\n");
        long s_start = System.currentTimeMillis();
        selection_sort(a);
        long s_end = System.currentTimeMillis();
        System.out.println("Selection Sort Execution Time : "+(s_end-s_start)+"ms");
        System.out.print("\n");
        long i_start = System.currentTimeMillis();
        insertion_sort(a);
        long i_end = System.currentTimeMillis();
        System.out.println("Insertion Sort Execution Time : "+(i_end-i_start)+"ms");
        System.out.print("\n");
        System.out.print("Sorting Using Quick Sort   : ");
        long q_start = System.currentTimeMillis();
        quick_sort(a,0, a.length-1);
        long q_end = System.currentTimeMillis();
        print_array(a);
        System.out.print("Quick Sort Execution Time : "+(q_end-q_start)+"ms");

    }
}
//ex  2 25 8 9 7 8 2 1 5 8 33 5 58 35 69 8 7 56 23 21 25 44 66 78 98
