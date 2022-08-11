public class List_ADT_Using_Linked_List {
    Node head;
    Node tail;
    private int size;
    List_ADT_Using_Linked_List()
    {
        size=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            this.data = value;
            this.next = null;
            size++;
        }
    }
    public void add_First(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;
            tail = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    public void add_Last(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;
            tail = new_node;
        }
        else {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void delete_first()
    {
        if(head==null)
        {
            System.out.print("\nEmpty List ... there should be atleast one element to delete..\n");
            return;
        }
        System.out.print("\nBefore Deleting \n");
        print_list();
        size--;
        System.out.print("After Deleting First Element "+head.data+"\n");
        head = head.next;
        print_list();
    }


    public void delete_first_occur(int delete_element)
    {
        boolean flag=false;
        int hd = head.data;
        int tl = tail.data;
        if(head==null)
        {
            System.out.print("\nEmpty List ... there should be atleast one element to delete..\n");
            return;
        }
        if(head.data==delete_element)
        {
            delete_first();
            flag = true;
        }
        if(tail.data==delete_element)
        {
            delete_last();
            flag = true;
        }
        else
        {
            Node temp = head;
            while (temp.next!=null)
            {
                if(temp.next.data==delete_element)
                {
                    flag = true;
                    temp.next = temp.next.next;
                    size--;
                    break;
                }
                temp = temp.next;
            }

        }
        if(flag==false)
        {
            System.out.print("\nElement you are trying to delete is not present in the list ...\n");
            return;
        }
        else
        {
            if(hd!=delete_element && tl!=delete_element)
            {
                System.out.print("After Deleting value "+ delete_element +"\n");
                print_list();
            }
        }
    }

    public void delete_all_occur(int delete_element) {
        boolean flag = false;
        int ct = 0;
        if (head == null) {
            System.out.print("\nEmpty List ... there should be atleast one element to delete..\n");
            return;
        }
        while(head.data == delete_element) {
            flag = true;
            head = head.next;
            ct+=1;
            size -= 1;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == delete_element) {
                flag = true;
                temp.next = temp.next.next;
                size-=1;
                ct++;
            } else {
                temp = temp.next;
            }
        }

        if (flag == false) {
            System.out.print("\nElement you are trying to delete is not present in the list ...\n");
            return;
        } else {
                System.out.print("\nAfter Deleting " + ct + " Occurrences of Element " + delete_element + '\n');
                print_list();
            }
        }
    public void delete_last()
    {
        if(head==null)
        {
            System.out.print("\nEmpty List ... there should be atleast one element to delete..\n");
            return;
        }
        System.out.print("\nBefore Deleting \n");
        print_list();
        size--;
        System.out.print("After Deleting Last Element "+tail.data+" \n");
        Node last_but_one = head;
        Node last = head.next;
        while (last.next!=null)
            {
                last=last.next;
                last_but_one = last_but_one.next;
            }
        last_but_one.next = null;
        tail = last_but_one;
        print_list();
        }

//    You can use any Sorting technique for making code lesser i am considering insertion...
           public void sort_list()
              {
                  if(head==null)
                  {
                      System.out.print("Empty List... --> []");
                  }
                  else {
                      Node current = head;
                      Node curr_next = null;
                      int temp;
                      while (current != null) {
                          curr_next = current.next;
                          while (curr_next != null) {
                              if (current.data > curr_next.data) {
                                  temp = current.data;
                                  current.data = curr_next.data;
                                  curr_next.data = temp;
                              }
                              curr_next = curr_next.next;
                          }
                          current = current.next;
                      }
                  }
                  System.out.print("\nAfter Sorting\n");
               print_list();
               }



    public void print_list()
    {
        if (head==null)
        {
            System.out.print("\nList is Empty ..    so no elements to print..\n");
            return;
        }
        Node temp = head;
        System.out.print("Linked List Elements -> [");
        while(temp.next!=null)
        {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.print(temp.data+"]");
        System.out.print("\nHead Element = "+head.data+"  Tail Element = "+tail.data+"  Size = "+size+'\n');
    }


    public static void main(String[] args) {
        List_ADT_Using_Linked_List lladt = new List_ADT_Using_Linked_List();
//        int arr[] = {1,4,2,7,8,9,2,3,3,5,4,7,5,3,1,2,5};
        int arr[] = {4,4,4,4,8,9,2,5,5,5,3,3,5,4,7,5,3,1,2,5};
        for(int i=0;i<arr.length;i++)
        {
            lladt.add_Last(arr[i]);
        }
        lladt.add_First(5);
        lladt.add_First(5);
        lladt.print_list();
        lladt.sort_list();
        lladt.delete_first();
        lladt.delete_last();
        lladt.delete_all_occur(4);
        lladt.delete_all_occur(5);
        lladt.delete_all_occur(50);
    }
}
