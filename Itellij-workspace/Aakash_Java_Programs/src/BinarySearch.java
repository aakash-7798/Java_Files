import java.util.*;
public class BinarySearch {
    public static int binary_search(int[] arr,int lb,int ub,int key)
    {
        if(lb<=ub)
        {
            int mid = lb+((ub-lb)/2);
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(key<arr[mid])
            {
                return binary_search(arr,lb,mid-1,key);
            }
            else
            {
                return binary_search(arr,mid+1,ub,key);
            }
        }
            return -1;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many elements you want to consider : ");
        int no_el = s.nextInt();
        int[] arr = new int[no_el];
        System.out.print("Enter elements : ");
        for(int i = 0;i<no_el;i++)
        {
            arr[i] = s.nextInt();
        }
        Arrays.stream(arr).sorted();
        System.out.print("Enter Key : ");
        int key = s.nextInt();
//        System.out.print(Arrays.binarySearch(arr,496));
        System.out.print(binary_search(arr,0,no_el,key));

    }
}