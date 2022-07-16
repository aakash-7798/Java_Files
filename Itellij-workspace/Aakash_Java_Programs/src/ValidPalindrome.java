import  java.util.*;
public class ValidPalindrome {
    public static void valid_palindrome(String str)
    {
        String r = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            r+=str.charAt(i);
        }
        if(r.equals(str))
            System.out.println(r +"  is a palindrome " );
        else
            System.out.println(str+" is not a palindrome " );
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = s.nextLine();
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        valid_palindrome(str);
    }
}
