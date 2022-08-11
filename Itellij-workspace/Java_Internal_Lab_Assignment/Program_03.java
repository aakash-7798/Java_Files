

//  Written By Aakash Nadupalli

//3. Write a Java program to perform the following operations:
//        a)create a singly linked list of integers.
//        b)traverse the above list and display its contents.
//        c)delete an integer from the above list and display the contents of the list after deletion.

public class Program_03 {
    Node head;
    Node tail;
    private int size;
    Program_03()
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
    public void Insert(int value)
    {
        Node new_node = new Node(value);
        if(isEmpty())
        {
            head = new_node;
            tail = new_node;
        }
        else
        {
            tail.next = new_node;
            tail = new_node;
        }
    }
    public void delete(int value)
    {
        if(isEmpty())
        {
            System.out.print("List is Empty....");
        }
        size--;
        if(head.data==value)
            {
                head = head.next;
            }
        else{
                Node temp = head;
                while (temp.next!=null)
                {
                    if(temp.next.data == value)
                    {
                        if(temp.next.data== tail.data)
                        {
                            temp.next = temp.next.next;
                            tail = temp;
                            break;
                        }
                        else{
                        temp.next = temp.next.next;
                        break;}
                    }
                    temp = temp.next;
                }
            }
        }
    public void print_list()
    {
        if(isEmpty())
        {
            System.out.print("Empty List...");
            return;
        }
        else {
            System.out.print("Singly Linked List Elements :  ");
            for(Node temp=head; temp!=null; temp=temp.next)
            {
                System.out.print(temp.data+" --> ");
            }
            System.out.print("Null"+"\n");
        }
        System.out.print("Head = "+head.data+" "+" Tail = "+tail.data+" "+" Size = "+size+"\n");
    }

    public static void main(String[] args) {
        Program_03 singly_linked_list = new Program_03();
        int[] a = {40, 25, 42, 78, 96, 88, 8};
        for(int i=0;i<a.length;i++)
        {
            singly_linked_list.Insert(a[i]);
        }
        System.out.print("Before Deletion "+"\n");
        singly_linked_list.print_list();
        singly_linked_list.delete(8);
        System.out.print("After Deletion "+"\n");
        singly_linked_list.print_list();
    }
}
