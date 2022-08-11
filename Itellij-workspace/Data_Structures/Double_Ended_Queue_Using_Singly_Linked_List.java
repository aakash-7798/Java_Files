public class Double_Ended_Queue_Using_Singly_Linked_List {
    Node front;
    Node rear;
    private int size;
    Double_Ended_Queue_Using_Singly_Linked_List()
    {
        size=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            this.data = value;
            this.next = null;
            size++;
        }
    }
    public void Enqueue_First(int value)
    {
        Node new_node = new Node(value);
        if(front==null)
        {
            front = new_node;
            rear = new_node;
            return;
        }
        new_node.next = front;
        front = new_node;
    }
    public void Enqueue_Last(int value)
    {
        Node new_node = new Node(value);
        if(front==null)
        {
            front=new_node;
            rear = new_node;
        }
        rear.next = new_node;
        rear = new_node;
    }

    public void Dequeue()
    {
        if(front==null)
        {
            System.out.print("Empty Queue... There should be atleast one element to delete....");
            return;
        }
        System.out.print("\nBefore Deleting ....\n");
        print_list();
        size--;
        int fe = front.data;
        front = front.next;
        System.out.print("After Deleting First Element -> "+fe+"\n");
        print_list();
    }

    public void Dequeue_Last()
    {
        if(front==null)
        {
            System.out.print("Empty Queue... There should be atleast one element to delete....");
            return;
        }
        size--;

        System.out.print("\nBefore Deleting ....\n");
        print_list();
        int rd = rear.data;

        Node last_but_one = front;
        Node last = front.next;

        while (last.next!=null)
        {
            last = last.next;
            last_but_one = last_but_one.next;
        }
        last_but_one.next = null;
        rear = last_but_one;

        System.out.print("After Deleting Last Element -> "+rd+"\n");
        print_list();
    }
    public void print_list()
    {
        if(front==null)
        {
            System.out.print("No Elements To Print..");
            return;
        }
        System.out.print("Double Ended Queue : ");
        Node temp = front;
        while (temp!=null)
        {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("Null\n");
        System.out.print("Front Element = "+front.data+"  Rear Element = "+rear.data+"  Size = "+size+'\n');
    }

    public static void main(String[] args) {
        Double_Ended_Queue_Using_Singly_Linked_List deq_sll = new Double_Ended_Queue_Using_Singly_Linked_List();
        for(int i=1;i<=10;i++)
        {
            deq_sll.Enqueue_First(i);
        }
        deq_sll.print_list();
        deq_sll.Dequeue();
        deq_sll.Dequeue_Last();
    }
}
