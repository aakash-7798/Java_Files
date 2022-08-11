public class Stacks {
    final int max = 100;
    int top;
    int[] a = new int[max];
    Stacks()
    {
        top=-1;
    }
    boolean isEmpty()
    {
        return (top<0);
    }
    boolean push(int ele)
    {
        if(top>=max-1) {System.out.print("Stack Overflow..... "); return false;}
        else {a[++top]=ele; return true;}
    }
    int pop()
    {
        if(top<0){System.out.print("Stack UnderFlow ...");}
        int x =a[top--]; return x;
    }
    int peek()
    {
        if(top>max-1){System.out.print("Stack OverFlow....");}
        return a[top];
    }
    void print()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
      Stacks s = new Stacks();
      System.out.print("Stack Elements : ");
      for(int i=1;i<=5;i++)
      {
          s.push(i);
      }
      s.print();
      s.pop();
      System.out.print("\nStack Elements After Pop : ");
      s.print();
      System.out.print("\nPeek Element : "+s.peek());
      s.pop();
      System.out.print("\nStack Elements After Another Pop : ");
      s.print();
    }
}
