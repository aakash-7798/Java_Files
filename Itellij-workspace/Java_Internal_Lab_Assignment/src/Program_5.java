
//  Written By Aakash Nadupalli

//5. Write a class for stack in Java. The class should have the methods, push(),pop(),isEmpty().
//        Use a linked(singly) representation for the stack. Write a Java program that reads a
//        list of integers, uses the above stack methods and displays list of integers in reverse order.

public class Program_5 {
    Node head;
    Node top;
    private int size;
    Program_5()
    {
        size=0;
    }
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
        if(head==null)
        {
            return true;
        }
        else
            return false;
    }
    public void push(int value)
    {
        Node new_node = new Node(value);
        if(isEmpty())
        {
            head = new_node;
            top = new_node;
        }
        else{
            top.next = new_node;
            top = new_node;
        }
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.print("Empty Stack...");
        }
        size--;
        Node temp = head.next;
        Node temp1 = head;
        while(temp.next!=null)
        {
            temp = temp.next;
            temp1 = temp1.next;
        }
        temp1.next = null;
        top = temp1;
    }
    public  Node reverse(Node node)
    {
        Node prev = null;
        Node next = null;
        Node current = node;
        while (current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public void print_list()
    {
        if(isEmpty())
        {
            System.out.print("Empty List...");
            return;
        }
        else {
            System.out.print("Stack -- Singly Linked List Elements :  ");
            int last=0;
            for(Node temp = head; temp!=null; temp=temp.next)
            {
                if(temp.next==null){ last = temp.data;}
                else{System.out.print(temp.data+" --> ");}
            }
            System.out.println(last);
        System.out.print("Top = "+top.data+" "+" Bottom = "+head.data+" "+" Size = "+size+"\n\n");
        }
    }

    public void print_list_reverse()
    {
        if(isEmpty())
        {
            System.out.print("Empty List...");
            return;
        }
        else {
            System.out.print("Stack -- Singly Linked List Elements Reversed :  ");
            int last=0;
            int hd = head.data;
            head = reverse(head);
            for(Node temp = head; temp!=null; temp=temp.next)
            {
                if(temp.next==null){ last = temp.data;}
                else{System.out.print(temp.data+" --> ");}
            }
            System.out.println(last);
            System.out.print("Top = "+hd+" "+" Bottom = "+head.data+" "+" Size = "+size+"\n\n");
        }


    }

    public static void main(String[] args) {
        Program_5 st_sll = new Program_5();
        int arr[] = {5,4,7, 40, 25, 42, 4, 78, 5, 88, 3, 2, 1, 8,23,43};
        for(int i=0;i< arr.length;i++)
        {
            st_sll.push(arr[i]);
        }
        st_sll.print_list();
        st_sll.pop();
        System.out.print("After Pop Operation "+"\n");
        st_sll.print_list();
        System.out.print("After Pop Operation "+"\n");
        st_sll.pop();
        st_sll.print_list();
        st_sll.print_list_reverse();
//        st_sll.print_list_reverse();
        System.out.print("After Pop Operation "+"\n");
        st_sll.pop();

    }
}
