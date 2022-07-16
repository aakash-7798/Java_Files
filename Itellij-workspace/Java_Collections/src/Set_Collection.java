import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class Set_Collection {
    public static void main(String args[])
    {
        HashSet<Integer> Hs = new HashSet<>();
        LinkedHashSet<Integer> Lhs = new LinkedHashSet<>();
        TreeSet<Integer> Ts = new TreeSet<>();
        for(int i:Arrays.asList(7,17,22,13,12)) {
            Hs.add(i);
            Lhs.add(i);
            Ts.add(i);
        }
        System.out.print("Hash Set Elements (Not Following Insertion Order): "+Hs);
        System.out.print("\nLinked Hash Set Elements (Following Insertion Order): "+Lhs);
        System.out.print("\nTree Set Elements (Following Insertion and Sorting is Done ): "+Ts);

    }
}
