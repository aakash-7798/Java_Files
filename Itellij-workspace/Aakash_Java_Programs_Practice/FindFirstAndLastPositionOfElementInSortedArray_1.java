import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray_1 {
    public static int[] find_first_and_last_position(int[] a,int target) {
        int[] ot = new int[2];
        ot[0] = -1;
        ot[1] = -1;
        if(a.length==0)
        {
            return ot;
        }
        else if(a.length ==1)
        {
            if(a[0]==target)
            {
                ot[0] = 0;
                ot[1] = 0;
            }
            return ot;
        }
        boolean flag = false;
        String str = "";
        if(a.length>1)
        {
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] == target)
                {
                    str+=String.valueOf(i);
                    flag = true;
                }
            }
        }
        int[] ot1;
        if(str.length()==1)
        {
            ot1 = new int[2];
            ot1[0] = Integer.parseInt(String.valueOf(str.charAt(0)));
            ot1[1] = Integer.parseInt(String.valueOf(str.charAt(0)));
        }
        else
        {
            ot1 = new int[str.length()];
            for(int s = 0;s<str.length();s++)
            {
                ot1[s] = Integer.parseInt(String.valueOf(str.charAt(s)));
            }
        }
        if (flag==false )
        {
            return ot;
        }
        else
        {
            return ot1;
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
        System.out.print("Enter Target : ");
        int tar = s.nextInt();
//        System.out.print("Array Elements : ");
//        for(int i=0;i<ele;i++) {
//            System.out.print(a[i]+" ");
//        }
        int[] otpt ;
        otpt = find_first_and_last_position(a,tar);
//        System.out.println();
        System.out.print("Target at : ");
        for(int o=0;o<otpt.length;o++)
        {
            System.out.print(otpt[o]+" ");
        }
    }
}
