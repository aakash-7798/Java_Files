
//  Written By Aakash Nadupalli

//13. Write a Java program to perform the following operations:
//        a)create a doubly linked list of integers.
//        b)traverse the above list and display its contents.
//        c)delete an integer from the above list and display the contents of the list after deletion.

import java.util.Arrays;
import java.util.List;

public class Program_13 {
    Node head;
    Node tail;
    private int size;
    class Node{
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
    public void insert(int value)
    {
        Node new_node = new Node(value);
        if (head==null)
        {
            head=new_node;
            tail=new_node;

        }
        else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }

    public void delete(int del_value)
    {
        if(head==null){
            System.out.println("Empty.. List");
        }
        else{
            size--;
            if(head.data==del_value)
            {
                head = head.next;
            }
            else if(tail.data==del_value)
            {
                tail.prev.next = null;
                tail = tail.prev;

//                Node temp = tail.prev.prev;
//                Node temp1 = tail.prev;
//                temp.next = temp1;
//                temp1.prev = temp;
//                temp1.next = null;
//                tail = temp1;
            }
             else{
                Node temp = head;
                while (temp.next!=null)
                {
                    if(temp.next.data==del_value)
                    {
                        temp.next.next.prev = temp;
                        temp.next = temp.next.next;
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
        System.out.println("After Deleting "+del_value);
        print_list();
    }
    public void print_list()
    {
        if(head==null){
            System.out.println("Empty List....");
            return;
        }
        else{
            System.out.print("Doubly Linked List Elements : ");
            for(Node temp=head;temp!=null;temp=temp.next)
            {
                System.out.print(temp.data+" <--> ");
            }
            System.out.println("Null");
            System.out.println("Head = "+head.data+" Tail = "+tail.data+" Size = "+size);
        }

    }

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(8,2, 1, 5, 8, 33, 5, 58, 35, 69, 8, 7, 56);
        Program_13 dll = new Program_13();
        for(int i: lst)
        {
            dll.insert(i);
        }
        dll.print_list();
        dll.delete(2);
        dll.delete(33);
        dll.delete(56);
        dll.delete(7);
//        System.out.print(dll.head.next.next.next.prev.data);
    }
}
