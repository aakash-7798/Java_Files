import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray_2 {
    public static int[] find_first_and_last_position(int[] a,int target)
       {
           int[] ot = new int[2];
          String str = " ";
         for(int i=0;i<a.length;i++)
         {
             str+=String.valueOf(a[i]);
         }
         System.out.print(str);
         System.out.print("\nTarget at : ");
         int fst = Integer.parseInt(String.valueOf(str.indexOf(String.valueOf(target))));
         int lst = Integer.parseInt(String.valueOf(str.lastIndexOf(String.valueOf(target))));
         if(fst>0 && lst>0) {
             ot[0] = fst-1;
             ot[1] = lst-1;
//             System.out.print((fst-1)+ " " + (lst-1));
         }
         else
         {
             ot[0] = -1;
             ot[1] = -1;
//             System.out.print(fst-1+ " " +lst);
         }
             return ot;
       }
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        System.out.print("How many Elements you want to consider  : ");
        int ele = s.nextInt();
        int[] a = new int[ele];
        System.out.print("Enter Elements  : ");
        for(int i=0;i<ele;i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter Target : ");
        int tar = s.nextInt();
        System.out.print("Array Elements : ");
        for(int i=0;i<ele;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nString Element : ");
        int[] otpt;
        otpt = find_first_and_last_position(a,tar);
        for(int o=0;o<otpt.length;o++)
        {
            System.out.print(otpt[o]+" ");
        }
// 0 0 0 0 1 2 3 3 4 5 6 6 7 8 8 8 9 9 10 10 11 11
//        0
    }
}
