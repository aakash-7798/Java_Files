public class Double_Ended_Queue_Using_Arrays {
    int[] a = new int[100];
    int front = 0, rear = 0, size = 0;

    public boolean isFull() {

        if (size >= a.length) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue_Last(int value) {
        if (!isFull()) {
            a[size] = value;
            size++;
            front = a[0];
            rear = a[size - 1];
        } else {
            System.out.print("Index out of Bounds...   Exceeded Max Limit of Array ..  The Array Size you initially given "
                    + a.length + " So Try To Increase Size...... ");
        }
    }

    public void Enqueue_First(int value) {
        int[] a1 = new int[a.length + 1];
        size++;
        System.out.print("\nAfter Inserting " + value + " At Front Position \n");
        if (a == null) {
            a1[0] = value;
        } else if (!isFull()) {
            for (int i = 1; i <= a.length; i++) {
                a1[i] = a[i - 1];
            }
            a = a1;
            a1 = null;
        } else {
            System.out.print("Array is Full....so insertion is not possible..");
        }
        front = a[0];
        rear = a[size - 1];
        print_array();
    }

    public void Dequeue() {
        if (a == null) {
            System.out.print("Empty Queue So Deletion Not Possible....");
        }
        System.out.print('\n');
        int tmp = front;
        System.out.print("Before Deleting  \n");
        print_array();
        for (int i = 0; i < size; i++) {
            a[i] = a[i + 1];
        }
        size--;
        front = a[0];
        System.out.print("After Deleting First Element "+tmp+"\n");
        print_array();
    }
    public void Dequeue_Last() {
        if (a==null) {
            System.out.print("Empty Queue So Deletion Not Possible....");
        }
        System.out.print('\n');
        int tmp = rear;
        System.out.print("Before Deleting  \n");
        print_array();
        int index;
        for(index=0;index<size;index++)
        {
            if(a[index]==rear)
            {
                break;
            }
        }
        if(index<size)
        {
            size--;
            for(int j=index;j<size;j++)
            {
                a[j] = a[j+1];
            }
        }
        rear = a[size-1];
        System.out.print("After Deleting Last Element "+tmp+"\n");
        print_array();
    }
    public void print_array()
    {
        System.out.print("Array Elements --> ");
            for(int i=0;i<size;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.print("\n");
            System.out.print("Front Element = "+front+"  Rear Element = "+rear+"  Size = "+size+"\n");
    }


    public static void main(String[] args) {
        Double_Ended_Queue_Using_Arrays deq = new Double_Ended_Queue_Using_Arrays();
        for(int i=1;i<20;i++)
        {
            deq.Enqueue_Last(i);
        }
        deq.print_array();
        deq.Enqueue_First(0);
        deq.Dequeue();
        deq.Dequeue_Last();
        deq.Dequeue_Last();
        deq.Dequeue();

    }
}
