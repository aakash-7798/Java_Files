

//  Written By Aakash Nadupalli

//7. Write a class for queue in Java. The class should have the methods, enque(),deque(),isEmpty(),
//        isFull().Use a an array representation for the queue. Write a Java program that reads a
//        list of integers, uses the above queue methods and displays list of integers in (FIFO)same order.

public class Program_7 {
    final int max = 100;
    private int[] arr = new int[max];
    private int size;
    Program_7()
    {
        size=-1;
    }
    public boolean isEmpty()
    {
        if(size<0){ return true;}
        else{return false;}
    }
    public void enque(int value)
    {
//        if(arr.length>max){System.out.print("Overflow.."+"\n");}
        arr[++size] = value;
    }
    public void deque()
    {
        if(isEmpty())
        {
            System.out.print("Empty Queue.."+"\n");
        }
        size--;
        for(int i=0;i<size;i++)
        {
            arr[i] = arr[i+1];
        }
    }
    public void print_queue()
    {
        if(isEmpty())
        {
            System.out.print("Empty Queue.."+"\n");
        }
        else {
            System.out.print("Queue Elements using Arrays : ");
            for(int i=0;i<size;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.print("\n"+"Front = "+arr[0]+" "+" Rear = "+arr[size-1]+" "+" Size = "+size+"\n");
        }
    }

    public static void main(String[] args) {
        Program_7 qu = new Program_7();
        int[] a = {69, 8, 7, 56, 23, 21, 25, 44, 66, 78, 98};
        for(int i=0;i<a.length;i++)
        {
            qu.enque(a[i]);
        }
        System.out.print("Before Deletion "+"\n");
        qu.print_queue();
        System.out.print("After Deletion "+"\n");
        qu.deque();
        qu.print_queue();
    }
}
