public class Singly_Linked_Lists {
    Node head;
    private int size;
    Singly_Linked_Lists()
    {
        size=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void Add_First(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    public void Add_Last(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head= new_node;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
             temp = temp.next;
        }
        temp.next = new_node;
    }

    public void insert_After(int index,int data)
    {
        Node new_node = new Node(data);
        int count=0;
        if(head==null)
        {
            System.out.print("List is Empty ..    so operation cannot be done//");
        }
        Node temp = head;
        while(temp!=null)
        {
            if(count==index-1)
            {
                new_node.next = temp.next;
                temp.next = new_node;
                break;
            }
            temp = temp.next;
            count++;
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
            head = null;
        }
        head = head.next;
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
            head = null;
        }
        Node last_but_one = head;
        Node last = head.next;
        while (last.next!=null)
        {
            last = last.next;
            last_but_one  = last_but_one.next;
        }
        last_but_one.next = null;
    }
    public void remove_at(int index)
    {
        if(index<0)
        {
            System.out.print("Index out of Bounds...");
            return;
        }
        if(head==null)
        {
            System.out.println(" List is empty .. so unable to perform delete operation");
            return;
        }
        size--;
        int count=0;
        if(index==0){
            if(head.next==null) {
                head = null;
            }
            else{
                head = head.next;
            }
        }
        Node temp = head;
        while(temp!=null)
        {
            if(count+1==index){
                if(temp.next.next==null){
                    temp.next = null;
                    break;
                }
                else{
                temp.next= temp.next.next;
                }
            }
            temp = temp.next;
            count++;
        }
    }
    public int get_head()
    {
        if(head==null){System.out.print("Empty List...   No Elements...");}
        else{
        return head.data;}
        return -1;
    }
    public int get_size()
    {
        return size;
    }
    public void Print_List()
    {
        if (head==null)
        {
            System.out.print("List is Empty ..    so no elements to print//\n");
        }
        Node temp = head;
        System.out.print("Linked List Elements : ");
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
//        System.out.print("\n"+"Head = "+head.data+" "+" Size = "+size+"\n");
    }
    public static void main(String[] args)
    {
        Singly_Linked_Lists ll = new Singly_Linked_Lists();
        for(int i=1;i<=10;i++)
        {
            ll.Add_Last(i);
        }
        ll.Print_List();
        ll.remove_at(0);
        ll.Print_List();

    }
}
