//1. Write a Java program that prints all real solutions to the quadratic equation
//ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula. If the discriminant
//b2 -4ac is negative; display a message stating that there are no real solutions.

import java.util.*;
import static java.lang.Math.sqrt;
public class Program1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		int a = s.nextInt();
		System.out.print("Enter b Value : ");
		int b = s.nextInt();
		System.out.print("Enter c Value : ");
		int c = s.nextInt();
		if((b*b)-(4*a*c)<0)
		{
			System.out.print("There are No Real Solutions !!");
		}
		else
		{
			int r1 = (int)Math.round((((-b) +sqrt((b*b)-(4*a*c)) ) / 2));
			int r2 = (int)Math.round((((-b) -sqrt((b*b)-(4*a*c)) ) / 2));
			System.out.print("The roots of equation ("+a+")X^2 +("+b+")X +"+"("+c+") are "+r1+","+r2);
		}
	}

}
