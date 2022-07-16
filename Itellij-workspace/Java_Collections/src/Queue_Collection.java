import java.util.*;

public class Queue_Collection {
    public static void main(String args[])
    {
        Queue<Integer> Q = new LinkedList<>();
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=1;i<10;i++)
        {
            Q.add(i*i*i);
            PQ.add(i*(i+1));
        }
        System.out.print("Queue Elements : "+Q);
        System.out.print("\nPriority Queue Elements : "+PQ);
        System.out.print("\n\nFollowing are the operations can be performed on queue and priority queue : ");
        System.out.print("\nLatest Element is the Peek Element in Queue : "+Q.peek());
        System.out.print("\nLatest Element is the Peek Element in Priority Queue : "+PQ.peek());
        System.out.print("\nPriority Queue Poll : ");
        while(!PQ.isEmpty())
        {
            System.out.print(PQ.poll()+" ");
        }

    }
//  All the operations that we performed so far for Linked List is applicable for queue
}
