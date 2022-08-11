
//  Written By Aakash Nadupalli

//18. Write a class for deque(double ended queue) in Java. The class should have the
//        methods, enquefirst(),dequefirst(),isEmpty(),enquelast(), and dequelast().
//        Use a linked(doubly) representation for the queue. Write a Java program that
//        reads a list of integers, uses the above deque methods and displays results.

public class Program_18 {
    Node head;
    Node tail;
    private int size;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void enque_first(int value)
    {
        Node new_node = new Node(value);
        if(isEmpty()){
            head = new_node;
            tail = new_node;
        }
        else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }
    public void enque_last(int value)
    {
        Node new_node = new Node(value);
        if(isEmpty()){
            head = new_node;
            tail = new_node;
        }
        else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }
    public void deque_first()
    {
        int hd = head.data;
        if(isEmpty())
        {
            System.out.println("Empty Deque....");
            return;
        }
        else{
            size--;
            head = head.next;
        }
        System.out.println("After Deleting "+hd);
        print_list();
    }

    public void deque_last()
    {
        int tl = tail.data;
        if(isEmpty())
        {
            System.out.println("Empty Deque....");
            return;
        }
        else{
            size--;
            Node temp = head;
            Node temp1 = head.next;
            while (temp1.next!=null)
            {
                temp = temp.next;
                temp1 = temp1.next;
            }
            temp.next = null;
            temp.prev.next = temp;
            tail = temp;
        }
        System.out.println("After Deleting "+tl);
        print_list();
    }
    public void print_list()
    {
        if(isEmpty())
        {
            System.out.println("Empty Deque..");
        }
        else{
            System.out.print("Deque Elements : ");
            for(Node temp=head;temp!=null;temp=temp.next)
            {
                System.out.print(temp.data+" --> ");
            }
            System.out.println("Null");
            System.out.println("Head = "+head.data+" Tail = "+tail.data+" Size = "+size+"\n");
        }

    }

    public static void main(String[] args) {
        Program_18 dq = new Program_18();
        dq.enque_first(15);
        dq.enque_first(21);
        dq.enque_first(33);
        dq.print_list();
        dq.enque_last(14);
        dq.enque_last(24);
        dq.enque_last(35);
        dq.print_list();
        dq.deque_first();
        dq.deque_last();
//        System.out.print(dq.tail.prev.prev.data);
    }
}