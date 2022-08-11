
//  Written By Aakash Nadupalli

//19. Write a class for stack in Java. The class should have the methods, push(),pop(),isEmpty().
//        Use a linked(doubly) representation for the stack. Write a Java program that reads a
//        list of integers, uses the above stack methods and displays list of integers in reverse order.

import java.util.Arrays;
import java.util.List;

public class Program_19 {
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
    public void push(int value)
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
    public void pop()
    {
        int tl = tail.data;
        if(isEmpty())
        {
            System.out.println("Empty Stack....");
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
            System.out.println("Empty Stack..");
        }
        else{
            System.out.print("Stack Elements : ");
            int last=0;
            for(Node temp=head;temp!=null;temp=temp.next)
            {
                if(temp.next==null){ last = temp.data;}
                else{System.out.print(temp.data+" --> ");}
            }
            System.out.println(last);
            System.out.println("Top = "+tail.data+" Bottom = "+head.data+" Size = "+size+"\n");
        }

    }

    public void print_list_reverse()
    {
        if(isEmpty())
        {
            System.out.println("Empty Stack..");
        }
        else{
            System.out.print("Stack Elements Reversed: ");
            int last = 0;
            for(Node temp=tail;temp!=null;temp=temp.prev)
            {
                if(temp.prev==null){ last = temp.data;}
                else{System.out.print(temp.data+" --> ");}
            }
            System.out.println(last);
            System.out.println("Top = "+head.data+" Bottom = "+tail.data+" Size = "+size+"\n");
        }

    }

    public static void main(String[] args) {
        Program_19 stack = new Program_19();
        List<Integer> lst = Arrays.asList(69, 8, 7, 56, 23, 21, 25, 44, 66, 78, 98);
        for(int i:lst){
            stack.push(i);
        }
        stack.print_list();
        stack.pop();
        stack.print_list_reverse();
        stack.pop();
        stack.print_list_reverse();
    }
}