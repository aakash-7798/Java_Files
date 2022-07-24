import java.util.Arrays;

public class Queues_Using_Linked_List {
    Node front;
    Node rear;
    private  int size;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void Enqueue(int ele)
    {
        Node new_node = new Node(ele);
        if(front==null)
        {
            front = new_node;
            rear = new_node;
            rear.next = null;
        }
        size++;
            rear.next = new_node;
            rear = new_node;

    }
    public void Enqueue_First(int value)
    {
        Node new_node = new Node(value);
        System.out.print("Value "+value+" Inserted at Front Position"+"\n");
        if(front==null)
        {
            front = new_node;
            rear = new_node;
            rear.next = null;
        }
        size++;
        new_node.next = front;
        front = new_node;
        print();
    }
    public void Enqueue_Last(int value)
    {
        Node new_node = new Node(value);
        System.out.print("Value "+value+" Inserted at Rear Position"+"\n");
        if(front==null)
        {
            front = new_node;
            rear = new_node;
            rear.next = null;
        }
        size++;
        rear.next = new_node;
        rear = new_node;
        rear.next = null;
        print();
    }
    public void Enqueue_After(int After_Which_Element,int value)
    {
        Node new_node = new Node(value);
        boolean flag = false;
        if(front==null)
        {
            System.out.print("List is Empty ..  This Operation can only be done if list has atleast one element...");
        }
        size++;
        if(front.data==After_Which_Element)
        {
            new_node.next = front.next;
            front.next = new_node;
            flag = true;
        }
        if(rear.data==After_Which_Element)
        {
//            Enqueue_Last(After_Which_Element);      This one also considered but for better practice i am writing following code
            new_node.next = rear.next;
            rear = new_node;
            new_node.next = null;
            flag = true;

        }
        Node temp = front;
        while (temp!=null)
        {
            if(temp.data==After_Which_Element)
            {
                new_node.next = temp.next;
                temp.next = new_node;
                flag = true;
            }
            temp = temp.next;
        }
        if(flag==true)
        {
            System.out.print("Value "+value+" Inserted After "+After_Which_Element+"\n");
            print();
        }
        else
        {
            System.out.print("  !!...  .   Element Not Present In the List ...>> ---   Specify only the element which is in the List ");
        }
    }



    public void Dequeue()
    {
        if(front==null)
        {
            System.out.print("List is Empty ... Delete opertion cannot be performed..");
        }
        size--;
        System.out.println("After Deleting Front Element  "+front.data);
        front = front.next;
        print();
    }
    public void Dequeue_last()
    {
        if(front==null)
        {
            System.out.print("List is Empty ... Delete opertion cannot be performed..");
        }
        size--;
        System.out.println("After Deleting rear Element "+rear.data);
        Node last_but_one = front;
        Node last = front.next;
        while(last.next!=null)
        {
            last = last.next;
            last_but_one = last_but_one.next;
        }
        last_but_one.next = null;
        rear = last_but_one;
        print();
    }
    public void print()
    {
        if(front==null)
        {
            System.out.print("Queue is Empty...");
        }
        else
        {
            System.out.print("Queue Elements using Linked List :  ");
            Node temp = front;
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("Null");
            System.out.print("\n"+"Front Element = "+front.data+"    "+"Rear Element = "+rear.data+"    "+"Size = "+size+"\n");
            System.out.println();
        }
    }

    public void print_for()
    {
        if(front==null)
        {
            System.out.print("Queue is Empty...");
        }
        else
        {
            System.out.print("Queue Elements using Linked List :  ");
            for( Node i =front;i!=null;i=i.next )
            {
                System.out.print(i.data+" -> ");

            }
            System.out.print("Null");
            System.out.print("\n"+"Front Element = "+front.data+"    "+"Rear Element = "+rear.data+"    "+"Size = "+size+"\n");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queues_Using_Linked_List ql = new Queues_Using_Linked_List();
        int tmp_arr[] = {7, 4, 9, 2, 5, 0,25,78,9,8,5,2};
//        for(int i=0;i<tmp_arr.length;i++)
//        {
//            ql.Enqueue(tmp_arr[i]);
//        }
//
////        for(int i=1;i<=15;i++)
////        {
////            ql.Enqueue(i);
////        }
//
//
//
//        ql.print();
////        System.out.println(ql.front.next.next.next.next.data);
//        ql.print_for();
//        ql.Enqueue_First(0);
//        ql.Enqueue_Last(16);
//        ql.Enqueue_After(25,30);
//        ql.Enqueue_After(7,3);
//        ql.Enqueue_After(16,45);
//        ql.Enqueue_After(789,450);
        ql.Dequeue();
//        ql.Dequeue_last();
        
    }
}
