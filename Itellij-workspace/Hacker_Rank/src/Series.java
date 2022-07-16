import java.util.*;
//import java.lang.Math;

public class Series {
    public static void series(int a,int b,int n)
    {
        int arr[] = new int[n];
        int s = 0;
        s=a+b;
        arr[0] =s;
        for(int i=1;i<n;i++) {
            s += (Math.pow(2,i) * b);
            arr[i] = s;
        }
        for(int i=0;i<arr.length;i++){System.out.print(arr[i]+" ");}System.out.println();
    }
    public static void main(String[] args)
    {
       Scanner s  = new Scanner(System.in);
       int tst = s.nextInt();
       for(int i=0;i<tst;i++)
       {
           int[] ar = new int[3];
           for(int j=0;j<ar.length;j++)
           {
               ar[j]= s.nextInt();
           }
           series(ar[0],ar[1],ar[2]);
       }
    }
}
//24 14 15
//48 5 9
//16 48 6