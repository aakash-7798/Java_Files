import java.util.*;
public class LinearSearch {
    public static void linear_search(int[] arr,int lb,int ub,int key)
    {
        boolean flag=false;
        while(lb<ub)
        {
            if (arr[lb] == key)
            {
                System.out.println("Element found at Index : " + lb);
                flag=true;
            }
            lb++;
        }

        if(flag==false)
        {
            System.out.println("Element Not found... ");
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
        System.out.print("Enter Key : ");
        int key = s.nextInt();
        linear_search(arr,0,no_el,key);
    }
}
