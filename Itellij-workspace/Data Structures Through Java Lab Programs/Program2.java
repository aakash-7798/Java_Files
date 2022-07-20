//2. The Fibonacci sequence is defined by the following rule. The fist two values in the
//sequence are 1 and 1. Every subsequent value is the run of the two values preceding
//it. Write a Java program that uses both recursive and non-recursive functions to print
//the nth value in the Fibonacci sequence.

import java.util.*;


public class Program2 {

    public static int Fibinocci(int n)
    {

        if(n==1 || n==2)
            return 1;
        else
            return Fibinocci(n-1)+Fibinocci(n-2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("I will give the first n Fibonacci Numbers!\nEnter n:: ");
        int n = s.nextInt();

        try {
            if(n <= 0){
                throw new Exception("n should be greater than 0");
            }

            int a[] = new int[n];
            System.out.print("All elements of the initial array are initialised to 0. a:: ");
            System.out.println(Arrays.toString(a));
            /*
            The 1st Fibonacci:: a[0]
            The nth fibonacci:: a[n-1]
             */

            // The Non Recursive case fails for n==1, unless we return for n==1 directly
            if(n==1){
                System.out.println("The Fibonacci Sequence Without Recursion : " + 1);
            }
            else{
                a[0] = 1;
                a[1] = 1;
                System.out.print("The Fibinocci Sequence Without Recursion : " + a[0] + "  " + a[1] + " ");
                for (int i = 2; i < n; i++) {
                    a[i] = a[i - 1] + a[i - 2];
                    System.out.print(" " + a[i] + " ");
                }
                System.out.println(" ");
            }


            // Recursive Implementation
            System.out.print("The Fibinocci Sequence With Recursion    :");
            for (int i = 1; i <= n; i++) {
                System.out.print(" " + Fibinocci(i) + " ");
            }
        }
        catch(Exception e){
            System.out.print("Exception caught: ");
            System.out.println(e.getMessage());
        }
    }

}
