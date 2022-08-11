import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_Lists {
    public static void main(String[] args)
    {
        LinkedList<Integer> Ll = new LinkedList<>();
        for(int i=1;i<=10;i++)
        {
            Ll.add(i*i);
        }
        LinkedList<Integer> Ll1 = new LinkedList<>();
        for(int i=12;i<=20;i++)
        {
            Ll1.add(i*i);
        }
        System.out.print("Linked List Elements : "+Ll);
        System.out.print("\nLinked List 1 Elements : "+Ll1);
        System.out.print("\n"+"The Following Are Operations Which can be Performed on Linked Lists : ");
        System.out.print("\n"+"Adding Element Using Add  : "+Ll.add(11*11)+" "+"  After Adding  : "+Ll);
        Ll.addAll(Ll1);
        System.out.print("\n"+"Adding Elements Using Add_All : "+Ll);
        Ll.addFirst(0);
        Ll.addLast(21*21);
        System.out.print("\n"+"Adding Elements Using Add_First and Add_Last : "+Ll);
        System.out.print("\n"+"Descending Iterator : ");
        Iterator It = Ll.descendingIterator();
        while (It.hasNext())
        {
            System.out.print(It.next()+" -> ");
        }
        System.out.print("Null");
        System.out.print("\n"+"Fetching Elements Using get_First and get_Last --> "+" " +"First Element in the List : "+Ll.getFirst()+" " +" Last Element in the List : "+Ll.getLast());
        Ll.add(7*7);
        System.out.print("\n"+"Linked List Elements : "+Ll);
        System.out.print("\n"+"Getting First Occurrence Using IndexOf : "+Ll.indexOf(49));
        System.out.print("\n"+"Getting Last Occurrence Using LastIndexOf : "+Ll.lastIndexOf(49));
        System.out.print("\n"+"List Iterator : ");
        ListIterator<Integer> LI = Ll.listIterator();
        while (LI.hasNext())
        {
            System.out.print(LI.next()+" -> ");
        }
        System.out.print("Null");
        System.out.print("\nElements Performing Operations  Offer Offer_first and Offer_Last ");
        System.out.print("\n"+Ll.offer(22*22)+"\n");
        System.out.print("After Offer Operation : "+Ll);
        System.out.print("\n"+Ll.offerFirst(2*2)+"\n");
        System.out.print("After OfferFirst Operation : "+Ll);
        System.out.print("\n"+Ll.offerLast(23*23)+"\n");
        System.out.print("After OfferLast Operation : "+Ll);
        System.out.print("\n\nElements Performing Operations  peek peek_first and peek_Last ");
        System.out.print("\n"+"Peek retrieving head element  : "+Ll.peek());
        System.out.print("\n"+"Peek_First retrieving head element   : "+Ll.peekFirst());
        System.out.print("\n"+"Peek_Last retrieving last element   : "+Ll.peekLast());
        System.out.print("\n\nElements Performing Operations  poll poll_first and poll_last ");
        System.out.print("\nLinked List Elements Before  : "+Ll);
        System.out.print("\n"+"Poll retrieving head element and removing it : "+Ll.poll());
        System.out.print("\n"+"Poll_First retrieving head element and removing it  : "+Ll.pollFirst());
        System.out.print("\n"+"Poll_Last retrieving last element and removing it  : "+Ll.pollLast());
        System.out.print("\n Linked List Elements After Above Operation : "+Ll);
    }
}
