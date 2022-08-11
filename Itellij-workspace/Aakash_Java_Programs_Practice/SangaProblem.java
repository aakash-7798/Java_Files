import  java.util.*;
import  java.util.List;
import  java.util.ArrayList;
public class SangaProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> L = new ArrayList<>();
        String[] st = s.nextLine().split(" ");
        for(String i: st)
        {
           L.add(Integer.parseInt(i)) ;
        }
        System.out.print("List elements : "+L);
        

    }
}
