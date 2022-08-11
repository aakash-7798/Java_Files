import java.util.*;
public class JavaUtilPackageFunctions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter How Many Elements you want to consider : ");
        int ele = s.nextInt();
        LinkedList<Integer> LL = new LinkedList<>();
        System.out.print("Enter Elements : ");
        for(int i=0;i<ele;i++)
        {
            LL.add(s.nextInt());
        }
        LL.addFirst(1);

        System.out.print("Linked List Elements : "+LL);

    }
}
//2 3 5 7 9 9 6 4 2 8 7 8 9 1 2