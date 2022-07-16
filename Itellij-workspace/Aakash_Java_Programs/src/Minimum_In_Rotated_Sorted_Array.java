import java.util.Scanner;

public class Minimum_In_Rotated_Sorted_Array {
    public static void Sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j =0;j<((a.length)-i)-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Elements : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void minimum_element_from_array(int[] a)
    {
        int min_ele = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min_ele>a[i])
            {
                min_ele = a[i];
            }
        }
        System.out.println();
        System.out.println("Minimum Element : "+min_ele);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many elements you want to consider : ");
        int ele = s.nextInt();
        int[] a = new int[ele];
        System.out.print("Enter elements : ");
        for (int i = 0; i < ele; i++)
        {
            a[i] = s.nextInt();
        }
        Sort(a);
        minimum_element_from_array(a);
    }
}
