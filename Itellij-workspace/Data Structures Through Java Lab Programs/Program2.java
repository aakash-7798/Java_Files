//2. The Fibonacci sequence is defined by the following rule. The fist two values in the
//sequence are 1 and 1. Every subsequent value is the run of the two values preceding
//it. Write a Java program that uses both recursive and non-recursive functions to print
//the nth value in the Fibonacci sequence.

import java.util.*;
public class Program2 {
	
	public static int Fibinocci(int n)
	{
		if(n>=0 && n<=1)
			return n;
		else
			return Fibinocci(n-1)+Fibinocci(n-2);
	}
	
	public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.print("Enter a number to which you want fibinooci sequence : ");
          int fib = s.nextInt();
          int a[] = new int[fib];
          a[0] = 1;
          a[1] = 1;
          System.out.print("The Fibinocci Sequence Without Recursion : "+a[0]+" "+a[1]);
          for(int i=2;i<a.length;i++)
          {
        	  a[i]=a[i-1]+a[i-2];
        	  System.out.print(" "+a[i]+" ");
          }
          System.out.println(" ");
          System.out.print("The Fibinocci Sequence With Recursion    :");
          for(int i=1;i<=fib;i++)
          {
          System.out.print(" "+Fibinocci(i)+" ");
          }
	}
	
}
