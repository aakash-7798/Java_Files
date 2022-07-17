public class Doubly_Linked_Lists {
    Node head;
    Node tail;
    private int size;
    Doubly_Linked_Lists()
    {
        size=0;
    }
     class Node
    {
        int data;
        Node next;
        Node prev;
        Node (int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }
    public void  add_First(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = tail = new_node;
            head.prev=null;
            tail.next=null;
        }

        else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
            new_node.prev = null;
        }
    }
    public void add_last(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = tail = new_node;
            head.prev=null;
            tail.next=null;
        }
        else {
            Node temp = head;
            while (temp.next!=null)
            {
                temp = temp.next;
            }
        temp.next = new_node;
        new_node.prev = temp;
        tail = new_node;
        new_node.next = null;
        }
    }
    public void delete_first()
    {
        if(head==null)
        {
            System.out.print("List is Empty ..    so no elements to delete//");
        }
        size--;
        if(head.next==null)
        {
            head=null;
            tail=null;
        }
        head = head.next;
        head.prev=null;
    }
    public void delete_last()
    {
        if(head==null)
        {
            System.out.print("List is Empty ..    so no elements to delete//");
        }
        size--;
        if(head.next==null)
        {
            head=null;
            tail=null;
        }
        else{
         Node last_but_one = head;
         Node last = head.next;
         while(last.next!=null)
         {
             last = last.next;
             last_but_one = last_but_one.next;
         }
         last_but_one.next = null;
         tail = last_but_one;
        }
    }

    public  void remove(int rem_data)
    {
        if(head==null){System.out.print("No Elements .. so deletion not possible.");}
        if(head.data==rem_data) {
            delete_first();
        }
        if(tail.data==rem_data)
        {
            delete_last();
        }
         else
         {
           Node temp = head;
           while (temp!=null)
           {
               if(temp.data==rem_data)
               {
                   temp.prev.next = temp.next;
                   temp.next.prev = temp.prev;
                   break;
               }
               temp = temp.next;
           }
         }
        }

//    }
    public void remove_At(int index)
    {
        if(index<=0 || index>get_size())
        {
            return;
        }
        if(head==null)
        {
            System.out.print("List is Empty ..    so no elements to delete//");
        }
        size--;
        if(head!=null)
        {
           Node temp = head;
           for(int i=1;i<index;i++)
           {
               temp = temp.next;
           }
           if(temp==head)
           {
               head = temp.next;
           }
           else if(temp==tail)
           {
               tail=tail.prev;
           }
           else {
               temp.prev.next = temp.next;
               temp.next.prev = temp.prev;
           }
           temp = null;
        }
    }
    public int get_head()
    {
        if(head==null)
        {
            System.out.print(" List is Empty .....  ");
        }
        return head.data;
    }
    public int get_tail()
    {
        if(head==null)
        {
            System.out.print(" List is Empty .....  ");
        }
        return tail.data;
    }
    public int get_size()
    {
        if(head==null)
        {
            System.out.print("Empty List..");
        }
        return size;
    }
    public void Print_Doubly_List()
    {
        if(head==null)
        {
            System.out.print(" List is Empty .....   Nothing to Print");
        }
        System.out.print("Doubly Linked List Elements : ");
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public void Print_Doubly_List_Reverse()
    {
        if(head==null)
        {
            System.out.print(" List is Empty .....   Nothing to Print");
        }
        System.out.print("Doubly Linked List Elements Reverse Order : ");
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.prev;
        }
        System.out.print("Null");
    }
    public static void main(String[] args)
    {
          Doubly_Linked_Lists Dl = new Doubly_Linked_Lists();
          for(int i=1;i<=10;i++)
          {
              Dl.add_last(i);
          }
          System.out.print("\nElements Before Deletion "+"\n");
          Dl.Print_Doubly_List();
          System.out.print("\n");
          Dl.Print_Doubly_List_Reverse();
          System.out.print("\n"+"Size of Doubly Linked List : "+Dl.get_size());
          System.out.print("\n"+"Head : "+Dl.get_head()+"   ");
          System.out.print("Tail : "+Dl.get_tail()+"\n\n");
          System.out.print("Elements After Deletion \n");
          Dl.delete_first();
          Dl.delete_last();
//          Dl.remove_At(2);
//          Dl.remove_At(6);
          Dl.delete_last();
          Dl.delete_last();
//          Dl.remove_At(1);
          Dl.remove(5);
          Dl.remove_At(4);
          Dl.Print_Doubly_List();
          System.out.print("\n");
          Dl.Print_Doubly_List_Reverse();
          System.out.print("\n"+"Size of Doubly Linked List : "+Dl.get_size());
          System.out.print("\n"+"Head : "+Dl.get_head()+"   "+"Tail : "+Dl.get_tail());


    }
}
