import java.util.*;
public class BinarySearch {
    public static void binary_search(int[] arr,int lb,int ub,int key)
    {
        boolean flag=false;
        while(lb<=ub)
        {
            int mid = arr.length/2;
            if(arr[mid]==key)
            {
                System.out.print("Element Found at : "+mid);
                flag=true;
            }
            else if(key<arr[mid])
            {
                binary_search(arr,lb,mid-1,key);
            }
            else
            {
                binary_search(arr,mid+1,ub,key);
            }
        }
        if(flag==false)
        {
            System.out.print("Element not Found ...");
        }
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
        binary_search(arr,0,no_el,key);
    }
}