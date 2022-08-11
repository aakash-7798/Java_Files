import java.util.Arrays;

public class Queues {
    int front,rear,size;
    int a[] = new int[100];
    Queues()
    {
        front=0;
        rear=0;
        size=0;
    }
    boolean isEmpty()
    {
        if(a==null) return true;
        else return false;
    }
    boolean isFull()
    {
        if(size>=a.length){return true;}
        else return false;
    }
    public void Enqueue(int ele)
    {
        if(!isFull()){if(a.length==0){a[front] = ele;} else{;a[rear++] = ele;}size+=1;}
        else{System.out.println("Queue is Full");}
    }
    public int Dequeue()
    {
        if(isEmpty()){System.out.print("Queue is Empty");}
        int x = a[front];front+=1;size-=1;
        return x;
    }
    public int front()
    {
        if(isEmpty()){System.out.print("Queue is Empty");}
        return a[front];
    }
    public int rear()
    {
        if(isEmpty()){System.out.print("Queue is Empty");}
        return a[rear-1];
    }
    public int get_size()
    {
        if(isEmpty()){System.out.print("Queue is Empty...");}
        return size;
    }
    public void print()
    {
        if(isEmpty()==true){System.out.print("List is Empty");}
            for (int i = front; i <rear; i++) {
                System.out.print(a[i] + " ");
            }
        }
    public static void main(String[] args) {
          Queues q = new Queues();
          System.out.print("Queue Elements : ");
          for(int i=1;i<=5;i++)
          {
              q.Enqueue(i);
          }
          q.print();
          System.out.print("\nFront ELement = "+q.front()+"  "+"Rear Element  = "+q.rear()+" "+"  Size of Queue = "+q.get_size());
          System.out.print("\nDequeue ELement = "+q.Dequeue()+"  ");
          System.out.print("\nQueue Elements After Dequeue : ");
          q.print();
        System.out.print("\nFront ELement = "+q.front()+"  "+"Rear Element  = "+q.rear()+" "+"  Size of Queue = "+q.get_size());



    }
}
