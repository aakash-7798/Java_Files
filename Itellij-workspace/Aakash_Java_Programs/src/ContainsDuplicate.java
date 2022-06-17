import java.util.*;
public class ContainsDuplicate {
    public static void contains_duplicate(List<Integer> a)
    {
        List<Integer> List2 = new ArrayList<Integer>(a.size());
        for(Integer i:a)
        {
            if(List2.contains(i))
            {
                System.out.println(" ");
                System.out.print("True ..  Above list contains duplicates");
                break;
            }
            if(!List2.contains(i))
            {
                List2.add(i);
            }
            if(a.equals(List2))
            {
                System.out.println(" ");
                System.out.print("False .. As Above list do not contain duplicates");
            }
        }
//        1 1 1 3 3 4 3 2 4 2
//        System.out.println(" ");
//        System.out.print("Unique List Elements : "+List2);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many elements you want to consider : ");
        int ele = s.nextInt();
        List<Integer> List = new ArrayList<Integer>(ele);
        System.out.print("Enter elements : ");
        for(int i=0;i<ele;i++)
        {
            List.add(s.nextInt());
        }
        System.out.print("List Elements : "+List);
        contains_duplicate(List);
     }
}
