import java.util.*;
public class KthLargestElement {
    public static void kth_largest_element(List<Integer> lst,int key)
    {
        List<Integer>new_lst = new ArrayList<>();
        for(Integer i:lst)
        {
            if(!new_lst.contains(i))
            {
                new_lst.add(i);
            }
        }
        Collections.sort(new_lst,Collections.reverseOrder());
        System.out.print("Unique List Elements : "+new_lst);
        int max_ele = new_lst.get(key-1);
        for(int i=key-1;i<new_lst.size();i++)
        {
            if(max_ele<new_lst.get(i))
            {
                max_ele = new_lst.get(i);
            }
        }
        System.out.println(" ");
        System.out.print("Maximum Element : "+max_ele);
    }
    public static void main(String[] args )
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many Elements you want to consider : ");
        int ele = s.nextInt();
        List<Integer> Lst=new ArrayList<Integer>(ele);
        System.out.print("Enter Elements  : ");
        for(int i=0;i<ele;i++)
        {
            Lst.add(s.nextInt());
        }
        System.out.print("Enter K : ");
        int k = s.nextInt();
        kth_largest_element(Lst,k);

    }
}

//3 2 3 1 2 4 5 5 6 7
//32 23 34 15 26 47 58 59 61 79