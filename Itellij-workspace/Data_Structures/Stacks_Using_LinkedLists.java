public class Stacks_Using_LinkedLists {
    Node head;
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
    public void push(int ele)
    {
        Node new_node = new Node(ele);
        if(head == null)
        {
            head=new_node;
        }
        else
        {
//            Node temp  = head;
            new_node.next = head;
            head = new_node;
        }
    }
    public int peek()
    {
        if(head == null)
        {
            System.out.print("No Elements in the List ");
        }
        return head.data;

    }
    public  void pop()
    {
        if(head == null)
        {
            System.out.print("No Elements in the List ");
        }
        head = head.next;
    }
    public void print()
    {
        if(head == null)
        {
            System.out.print("No Elements in the List ");
        }
        Node temp = head;
        if(temp==head)
        {
            System.out.print("peek element-->"+"("+temp.data+")");
        }
        while(temp!=null)
        {
            if(temp.next==null){break;}
            System.out.print(" <- "+temp.next.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stacks_Using_LinkedLists sl = new Stacks_Using_LinkedLists();
        for(int i=1;i<=15;i++){sl.push(i);}
        System.out.print("Stack ELements Using Linked Lists : ");
        sl.print();
        System.out.print("\nPeek ELement: "+sl.peek());
        System.out.print("\nStack ELements After Pop : ");
        sl.pop();
        sl.print();
    }
}
