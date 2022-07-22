import java.util.*;


public class Program3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number To Which You Want Prime Numbers To : ");
        int p = s.nextInt();
        System.out.print("The Prime Numbers are : ");
        for(int i=2;i<p;i++)
        {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n){
        // The given function returns true even for n==2
        int k = (int)Math.sqrt(n);

        for(int i = 2; i <= k; i++){
            if(n%i == 0){
                return false;
            }
        }

        //If the above for loop checking divisibility failed completely, the number must be prime and the below statement is returned
        return true;
    }
}
