import java.util.Stack;
public class Stack_Collection {
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=10;i++)
        {
            stack.push(i);
        }
        System.out.print("Stack Elements : "+stack);
        System.out.print("\nFollowing are the operations performed on stack  ");
        System.out.print("\nPeek Operation retrieves top most element : "+stack.peek());
        System.out.print("\nPop Operation  removes top most element : "+stack.pop()+"  "+"\n"+"After Pop Operation Elements in Stack : "+stack);
        System.out.print("\nPush Operation adds element at last : "+stack.push(11)+"\n"+"After Push Operation Elements in Stack : "+stack);
        System.out.print("\nSearch Operation retrieves index of Specified element if exists : "+stack.search(8));
    }
}
