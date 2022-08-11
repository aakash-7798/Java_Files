
//  Written By Aakash Nadupalli

//24. Write a class for circular queue in Java. The class should have the methods,
//        enque(),deque(),isEmpty(), isFull().Use an array representation for the queue. Write a
//        Java program that reads a list of integers, uses the above queue methods and displays list
//        of integers in (FIFO)same order.

class Program_24{
    static int[] arry;
    int front,rear;
    Program_24(int size)
    {
        arry = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty()
    {
        if(front==-1 && rear==-1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull()
    {
        if((rear+1)%arry.length==front)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void enque(int value)
    {
        if(!isFull()){
            if(front==-1 && rear==-1){
                front=rear=0;
                arry[rear] = value;
            }
            else{
            rear = (rear+1)%arry.length;
            arry[rear] = value;
        }
        }
        else {
            System.out.println("\nCircular Queue is Full....");
            return;
        }
    }

    public void deque()
    {
        if(isEmpty()){
            System.out.println("\nCircular Queue is Empty....");
            return;
        }
        else if (front==rear) {
            System.out.println("\nAfter Deleting "+arry[front]);
            front=rear=-1;
            print_array();
        }
        else {
            System.out.println("\nAfter Deleting "+arry[front]);
            front = (front+1)%arry.length;
            print_array();
        }

    }
    public void print_array()
    {
        if(isEmpty())
        {
            System.out.println("\nCircular Queue is Empty....");
        }
        System.out.print("\nCircular Queue Elements -> ");
        for(int i=front;i!=rear;i=(i+1)%arry.length)
        {
            System.out.print(arry[i]+" ");
        }
        System.out.print(arry[rear]);
        System.out.println("\n"+"Front = "+arry[front]+" Rear = "+arry[rear]+" Size = "+arry.length);
    }

    public static void main(String[] args) {
        Program_24 cq = new Program_24(5);
        for(int i=0;i<5;i++)
        {
            cq.enque(i);
        }
        cq.print_array();
        cq.enque(5);
        cq.deque();
        cq.enque(5);
        cq.print_array();
        cq.enque(6);
        cq.deque();
        cq.enque(6);
        cq.print_array();
    }
}