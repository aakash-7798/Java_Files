import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Array_Deque {
    public static void main(String[] args)
        {
            ArrayDeque<Integer> AD = new ArrayDeque<>();
            ArrayDeque<Integer> AD1 = new ArrayDeque<>();
            for(int i=1;i<=10;i++) {AD.add(i);}
            for(int i=13;i<=20;i++) {AD1.add(i);}
            System.out.print("AD Elements : "+AD);
            System.out.print("\nAD1 Elements : "+AD1);
            System.out.print("\nAdding element at Last : ");
            AD.addLast(11);
            System.out.print("\nAD Elements : "+AD);
            System.out.print("\nAdding element at First : ");
            AD1.addFirst(12);
            System.out.print("\nAD1 Elements : "+AD1);
            System.out.print("\nAdding AD1 Elements To AD : ");
            AD.addAll(AD1);
            System.out.print("\nAD Elements : "+AD);
            System.out.print("\nClone --  Shallow copy of Elements : ");
            Deque<Integer> AD_Copy = AD.clone();
            System.out.print("\nAfter Clone --> ");
            System.out.print("New AD_Copy Elements : "+AD_Copy);
            System.out.print("\nClear  -->  Removing All Elements ");
            System.out.print("\nAfter Clear --> ");
            AD_Copy.clear();
            System.out.print("New AD_Copy Elements : "+AD_Copy);
            System.out.print("\nContains --> checks whether element presents ");
            System.out.print("\nIf Presents Returns Boolean Value (true/false): "+AD.contains(5));
            System.out.print("\nforEach --> Iterates until throws exception ");
            AD.forEach((n)-> System.out.print(n+" "));
            System.out.print("\nGet_first element and Get_last element --> "+" First Element : "+AD.getFirst()+" Last Element : "+AD.getLast());
            System.out.print("\nAD Elements Before Below Operations : "+AD);
            System.out.print("\nOffer --> inserts element at the end of deque. ");
            AD.offer(21);
            System.out.print("\nAD Elements After Offer: "+AD);
            System.out.print("\nOffer_First --> inserts element at the front of deque. ");
            AD.offerFirst(0);
            System.out.print("\nAD Elements After Offer First: "+AD);
            System.out.print("\nOffer_Last --> inserts element at the end of deque. ");
            AD.offerLast(22);
            System.out.print("\nAD Elements Offer Last : "+AD);
            System.out.print("\npeek --> return head element without removing. ");
            System.out.print("Peek Element : "+AD.peek());
            System.out.print("\npoll --> return head element and also removes it. ");
            System.out.print("\nAD Elements Before Poll : "+AD);
            System.out.print("\nPoll Element : "+AD.poll());
            System.out.print("\nAD Elements After Poll : "+AD);
            System.out.print("\n RemoveIf --> The removeIf() method of ArrayDeque is used to remove all those elements" +
                                "from ArrayDeque which satisfies a given predicate filter condition passed as a parameter"+
                                "to the method. This method returns true if some element are removed ");
            System.out.print("\nBefore RemoveIf Operation AD1 Elements :"+AD1);
            AD1.removeIf((n)-> n%2==0);
            System.out.print("\nRemoving Even Numbers From AD1 Elements ");
            System.out.print("\nAfter RemoveIf Operation AD1 Elements :"+AD1);
            System.out.print("\nDescending Iterator :");
            Iterator It = AD.descendingIterator();
            while (It.hasNext())
            {
                System.out.print(It.next()+" ");
            }

        }
}
