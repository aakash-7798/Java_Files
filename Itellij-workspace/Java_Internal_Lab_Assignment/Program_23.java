import java.util.*;

public class Program_23 {
    public static List<String> quick_sort(List<String> lst)
    {
        if(lst.size()<2)
        {
            return lst;
        }
        else{
        List<String> All = new ArrayList<>();
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        String pivot = lst.get(0);
        for(int i=1;i<lst.size();i++)
        {
            if(lst.get(i).compareToIgnoreCase(pivot)<=0)
            {
                left.add(lst.get(i));
            }
            else {
                right.add(lst.get(i));
            }
        }
        All.addAll(quick_sort(left));
        All.addAll(Arrays.asList(pivot));
        All.addAll(quick_sort(right));
        return All;
    }
    }
    public static void main(String[] args) {
        List<String> lt1 = Arrays.asList("rama","sita","laxmana","bharatha","anjaneya","dasaratha","oormila");
        List<String> lt2 = Arrays.asList("bhima","nakula","yudhistira","sahadeva","arjuna","duryodhana","dushasana","vikrana","chitrasena","karna");
        System.out.print("Unsorted List -> "+lt1+"\n");
        List sr_lt1 = quick_sort(lt1);
        System.out.print("Sorted List -> "+sr_lt1+"\n");
        System.out.print("Unsorted List -> "+lt2+"\n");
        List sr_lt2 = quick_sort(lt2);
        System.out.print("Sorted List -> "+sr_lt2+"\n");
    }
}
