import java.util.*;
public class BinarySearch_1 {
    public static void quick_sort(int[] a,int lb,int ub)
    {
        if(lb<ub)
        {
            int i=lb;
            int pivot = a[ub];
            for(int j=lb;j<ub;j++)
            {
                if(a[j]<=pivot)
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
    public static int binary_search(int[] a,int lb,int ub,int key)
    {
        if(lb<=ub)
        {
            int mid = lb+((ub-lb)/2);
            if(key < a[mid])
            {
                return binary_search(a,lb,mid-1,key);
            }
            else if(key>a[mid])
            {
                return binary_search(a,mid+1,ub,key);
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How Many Elements you want to consider : ");
        int ele = s.nextInt();
        int a[] = new int[ele];
        System.out.print("Enter Elements : ");
        for(int i=0;i<ele;i++)
        {
            a[i] =s.nextInt();
        }
        System.out.print("Sorted Elements : ");
        quick_sort(a,0,ele-1);
        for(int i=0;i<ele;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");
        System.out.print("What element you want to search from above elements : ");
        int srch = s.nextInt();
        int ot = binary_search(a,0,ele-1,srch);
        if(ot==-1)
        {
            System.out.print("Element not found..");
        }
        else
        {
            System.out.print("Element found at index "+(ot));
        }
    }
}
