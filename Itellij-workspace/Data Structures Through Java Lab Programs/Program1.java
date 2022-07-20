//1. Write a Java program that prints all real solutions to the quadratic equation
//ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula. If the discriminant
//b2 -4ac is negative; display a message stating that there are no real solutions.

import java.util.*;
import static java.lang.Math.sqrt;
public class Program1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Equation is:: ax^2 + bx + c");
        System.out.print("Enter \"a\" Value : ");
        double a = s.nextDouble();

        System.out.print("Enter \"b\" Value : ");
        double b = s.nextDouble();
        System.out.print("Enter \"c\" Value : ");
        double c = s.nextDouble();

        System.out.printf("a: %f, b: %f, c: %f%n", a, b, c);
        if((b*b)-(4*a*c)<0)
        {
            System.out.print("There are No Real Solutions !!");
        }
        else
        {
            double r1 = (((double)((-b) +sqrt((b*b)-(4*a*c)) ) ) / 2);
            double r2 = (((double)((-b) -sqrt((b*b)-(4*a*c)) ) ) / 2);
            System.out.printf("The roots of equation are %.3f and %.3f", r1, r2);
        }
    }

}
