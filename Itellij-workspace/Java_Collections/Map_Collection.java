import java.util.*;

public class Map_Collection {
    public static void main(String[] args) {
        HashMap<String,Integer> Hm = new HashMap<>();
        LinkedHashMap<String,Integer> Lhm = new LinkedHashMap<>();
        TreeMap<String,Integer> Tm = new TreeMap<>();
        List<String> L1 = Arrays.asList("Aakash","Akshay","Amit","Aadarsh","Ankith");
        List<Integer> L2 = Arrays.asList(210315,210316,210317,210318,210319);
        for(int i=0;i<L1.size();i++)
        {
            Hm.put(L1.get(i),L2.get(i));
            Lhm.put(L1.get(i),L2.get(i));
            Tm.put(L1.get(i),L2.get(i));
        }

        System.out.println("Hash Map : (Not Following Insertion Order)  -->   " + Hm);
        System.out.println("\nLinkedHash Map : (Following Insertion Order)  -->   " +Lhm);
        System.out.println("\nTree Map : (Following Insertion Order and Sorts )  -->   " +Tm);


//        Iterator Keys = Arrays.asList("Aakash","Akshay","Amit","Aadarsh","Ankith").iterator();
//        Iterator Values = Arrays.asList(210315,210316,210317,210318,210319).iterator();
//        while (Keys.hasNext() && Values.hasNext())
//        {
//          Hm.put((String) Keys.next(),(Integer)Values.next());
//          Lhm.put((String) Keys.next(),(Integer)Values.next());
//          Tm.put((String) Keys.next(),(Integer)Values.next());
//       }
        for(Map.Entry<String,Integer> e: Hm.entrySet())
        {
            System.out.println("e  " + e);
            System.out.print("keys : "+e.getKey()+"\n");
            System.out.print("Values : "+e.getValue()+"\n");
        }
    }
}
