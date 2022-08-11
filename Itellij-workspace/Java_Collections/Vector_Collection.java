import java.util.Iterator;
import java.util.Vector;
import java.util.*;
public class Vector_Collection {
    public static void main(String[] args)
    {
        Vector<Integer> Vt = new Vector<>(10,1);
        for(int i=100;i<=110;i++)
        {
            Vt.add(i);
        }
        System.out.print("Vector Elements : "+Vt);
        System.out.print("\nFollowing are the some of operations performed on Vector  ");
        System.out.print("\nCapacity of Vector : "+Vt.capacity());
        System.out.print("\nFirst Element : "+Vt.firstElement());
        System.out.print("\nLast Element : "+Vt.lastElement());
        System.out.print("\nForEachIterator : ");
        Vt.forEach((n) -> System.out.print(n+" "));
        System.out.print("\nHashCode: "+Vt.hashCode());
        System.out.print("\nInserting At Specified Location : ");
        Vt.insertElementAt(111,Vt.capacity());
        System.out.print("\nVector Elements : "+Vt);
        System.out.print("\nIterator  : ");
        Iterator It = Vt.iterator();
        while (It.hasNext())
        {
            System.out.print(It.next()+" ");
        }
        System.out.print("Sort : ");
        Collections.sort(Vt,Collections.reverseOrder());
        System.out.print("\nAfter Sorting in reverse order : "+Vt);
    }
}
