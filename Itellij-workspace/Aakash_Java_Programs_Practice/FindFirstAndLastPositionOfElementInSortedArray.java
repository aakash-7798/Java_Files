import java.util.*;
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void find_first_and_last_position(int[] a,int target) {
        int[] ot = new int[2];
        ot[0] = -1;
        ot[1] = -1;
        if (a.length == 0) {
            System.out.println();
            for (int i = 0; i < ot.length; i++) {
                System.out.print(ot[i] + " ");
            }
        }
        if(a.length==1)
        {
            if(a[0]==target)
            {
                ot[0] = 0;
                ot[1] = 0;
                System.out.println();
                for (int i = 0; i < ot.length; i++) {
                    System.out.print(ot[i] + " ");
                }
            }
            else
            {
                System.out.println();
                for (int i = 0; i < ot.length; i++) {
                    System.out.print(ot[i] + " ");
                }            }
        }
        boolean f1 = false;
        if(a.length == 2) {
            if (a[0] == target && a[1] == target) {
                ot[0] = 0;
                ot[1] = 1;
                f1 = true;
                System.out.println();
                for (int i = 0; i < ot.length; i++) {
                    System.out.print(ot[i] + " ");
                }
            } else {
                if (a[0] == target) {
                    ot[0] = 0;
                    ot[1] = 0;
                    f1 = true;
                    System.out.println();
                    for (int i = 0; i < ot.length; i++) {
                        System.out.print(ot[i] + " ");
                    }
                } else if (a[1] == target) {
                    ot[0] = 1;
                    ot[1] = 1;
                    f1 = true;
                    System.out.println();
                    for (int i = 0; i < ot.length; i++) {
                        System.out.print(ot[i] + " ");
                    }
                }
            }
            if (f1 == false) {
                System.out.println();
                for (int i = 0; i < ot.length; i++) {
                    System.out.print(ot[i] + " ");
                }
            }
        }
        if (a.length >2) {
            boolean flag = false;
            String str = "";
            for (int i = 0; i < a.length; i++) {
                if (a[i] == target) {
                    str+=String.valueOf(i);
                    flag = true;
                }
            }
            int[] ot1 = new int[str.length()];
            for(int s = 0;s<str.length();s++)
            {
                ot1[s] = Integer.parseInt(String.valueOf(str.charAt(s)));
            }
            System.out.print("Target Present at : ");
            for(int s1 =0;s1< ot1.length;s1++)
            {
                System.out.print(ot1[s1]+" ");
            }
//            System.out.print(str + " "+"Length : "+str.length());
            if (flag == false) {
                System.out.println();
                for (int j = 0; j < ot.length; j++) {
                    System.out.print(ot[j] + " ");
                }
            }
        }
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
//        System.out.print("Array Elements : ");
//        for(int i=0;i<ele;i++) {
//            System.out.print(a[i]+" ");
//        }
        find_first_and_last_position(a,8);
    }
}
