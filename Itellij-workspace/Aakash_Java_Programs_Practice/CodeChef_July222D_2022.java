import java.util.*;
public class CodeChef_July222D_2022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Test Cases : ");
        int tt = s.nextInt();
       for(int i=0;i<tt;i++){
           ArrayList<Integer> Lst = new ArrayList<>();
           for(int j=0;j<4;j++) {
               Lst.add(s.nextInt());
           }
//           System.out.print("Lst = "+Lst);
           if( ( Lst.get(0) * Lst.get(2) )  > Lst.get(3) )
           {
               System.out.print(-1);
           }
           else if( (Lst.get(0) * Lst.get(2) ) == Lst.get(3) )
           {
               System.out.print(Lst.get(2)+" "+0);
           }
           else
           {
               int init_n = Lst.get(2);
//               System.out.print("\nInit_n = "+init_n+'\n');
               int cost = (  Lst.get(1)*Lst.get(2) ) + ( Lst.get(0) * (Lst.get(2) - init_n) );
//               System.out.print("cost = "+cost+"\n");
               while (cost > Lst.get(3))
               {
                   init_n--;
//                   System.out.print("Init_n = "+init_n+"\n");
                   cost = (Lst.get(1)*init_n) + (Lst.get(0)*(Lst.get(2) - init_n));
//                   System.out.print("cost = "+cost+"\n");
               }
               System.out.print((Lst.get(2)-init_n)+" "+init_n);
           }
           System.out.println();

        }
    }
}
