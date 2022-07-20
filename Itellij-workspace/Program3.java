import java.util.*;
public class Program3 {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.print("Enter The Number To Which You Want Prime Numbers To : ");
	int p = s.nextInt();
	System.out.print("The Prime Numbers are : ");
	for(int i=2;i<p;i++)
	{ 
		boolean f = true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				f=false;
			}
		}
		if(f)
		{
			System.out.print(i+" ");
		}
	}
}
}
