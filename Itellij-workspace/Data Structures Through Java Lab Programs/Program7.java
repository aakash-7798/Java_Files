/*
    Created on:: 22nd July 2022
    Author:: Nikhil Bhamidipati
 */



import java.util.*;


public class Program7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String str1 = s.nextLine();

        StringTokenizer st1 = new StringTokenizer(str1, " ");

        int sum = 0;
        while(st1.hasMoreTokens()){
            String str_num = st1.nextToken();
            System.out.println(str_num);
            sum += Integer.parseInt(str_num);
        }

        System.out.printf("\nThe sum of the above numbers is %d\n", sum);


    }
}
