
//  Written By Aakash Nadupalli

//6. Write a class for queue in Java. The class should have the methods, enque(),deque(),isEmpty().
//        Use a linked(singly) representation for the queue. Write a Java program that reads a
//        list of integers, uses the above queue methods and displays list of integers in same order(FIFO).

public class Program_06 {
    Node front;
    Node rear;
    private int size;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public boolean isEmpty()
    {
        if(front==null)
            return true;
        else
            return false;
    }
    public void enque(int value)
    {
        Node new_node = new Node(value);
        if(isEmpty())
        {
            front=new_node;
            rear = new_node;
        }
        else{
            rear.next = new_node;
            rear  = new_node;
        }
    }
    public void deque()
    {
        if(isEmpty())
        {
            System.out.print("Deletion is not possible ... Empty Queue."+"\n");
        }
        size--;
        front=front.next;
    }
    public void print_queue()
    {
        if(isEmpty())
        {
            System.out.print("Empty Queue..."+"\n");
        }
        else{
         System.out.print("Queue -- Singly Linked List Elements : ");
        for(Node temp = front;temp!=null;temp=temp.next)
        {
            System.out.print(temp.data+" --> ");
        }
        System.out.print("Null"+"\n");
        System.out.print("Front = "+front.data+" "+"Rear = "+rear.data+" Size = "+size+"\n");
    }
    }

    public static void main(String[] args) {
        Program_06 que = new Program_06();
        int arr[] = {2,25,8,9,7, 8,2, 1, 5, 8, 33, 5, 58, 35};
        for(int i=0;i< arr.length;i++)
        {
         que.enque(arr[i]);
        }
        System.out.print("Before Deletion "+"\n");
        que.print_queue();
        System.out.print("After Deletion "+"\n");
        que.deque();
        que.deque();
        que.print_queue();
    }

}
