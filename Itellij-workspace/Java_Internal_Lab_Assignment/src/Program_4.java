
//  Written By Aakash Nadupalli
//
//4. Write a class for stack in Java. The class should have the methods, push(),pop(),isEmpty(),
//        isFull().Use an array representation for the stack. Write a Java program that reads a list
//        of integers, uses the above stack methods and displays list of integers in reverse order.

public class Program_4 {
    final int max= 100;
    private int[] arr = new int[max];
    int top;
    Program_4()
    {
        top=-1;
    }
    boolean isEmpty()
    {
        return(top<0);
    }
    boolean isFull()
    {
        return (top>=max);
    }
    public void push(int val)
    {
        if(!isFull())
        {
            arr[++top]=val;
        }
        else {
            System.out.print("Stack OverFlow");
        }
    }
    public int pop()
    {
        int x=0;
        if(!isEmpty())
        {
            x =  arr[top--];
        }
        else{System.out.print("Empty Stack....");}
        return x;
    }
    public void print_array()
    {
        if(!isEmpty()){
            System.out.print("Stack Elements  -> ");
            for(int i=0;i<=top;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.print("Stack Empty....");
        }
        System.out.println();
    }
    public void print_array_reverse()
    {
        if(!isEmpty()){
        System.out.print("Stack Elements In Reverse Order -> ");
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        }
        else{
            System.out.print("Stack Empty....");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Program_4 stack = new Program_4();
        int arr[] = {7, 40, 25, 42, 4, 78, 96};
        for(int i=0;i< arr.length;i++)
        stack.push(arr[i]);
        System.out.print("Before Deletion  ");
        stack.print_array();
        System.out.print("After Deletion  ");
        stack.pop();
        stack.print_array();
        stack.print_array_reverse();
    }
}
