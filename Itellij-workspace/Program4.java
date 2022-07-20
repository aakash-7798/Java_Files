import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String : ");
        String p = s.next();
        String r = "";
        for(int i=p.length()-1;i>=0;i--)
        {
        	r+=p.charAt(i);
        }
        if(p.equals(r))
        {
        System.out.print(r+" is Palindrome");
	    }
        else
        {
        System.out.print(p+" is not a Palindrome");
        }
	}

}
