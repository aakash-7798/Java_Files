import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_22 {
    public static List<String> Insertion_sort(List<String> lst)
    {
        for(int i=1;i<lst.size();i++)
        {
            int j=i-1;
            while (j>=0)
            {
                if(lst.get(j).compareToIgnoreCase(lst.get(j+1))>0)
                {
                    Collections.swap(lst,j,j+1);
                }
                j--;
            }
        }
        return lst;
    }
    public static int binary_search(List<String> lst,String key)
    {
        int lb = 0,k=0;
        int ub = lst.size()-1;
        while (lb<=ub)
        {
            int mid = lb+(ub-lb)/2;
            if(lst.get(mid)==key)
            {
                k = mid;
                return mid;
            } else if ( key.compareToIgnoreCase(lst.get(mid))<0 ) {
                ub = mid-1;
            }
            else {
                lb = mid+1;
            }
        }
        k=-1;
        return k;
    }
    public static void main(String[] args) {
//        List<String> lt = Arrays.asList("rama","sita","laxmana","bharatha","anjaneya","dasaratha","oormila");
        List<String> lt = Arrays.asList("bhima","nakula","yudhistira","sahadeva","arjuna","duryodhana","dushasana","vikrana","chitrasena","karna");
        System.out.print("Unsorted List -> "+lt+"\n");
        List sr_lt = Insertion_sort(lt);
        System.out.print("Sorted List -> "+sr_lt+"\n");
        System.out.println("Element Found at Index "+binary_search(sr_lt,"nakula"));
        System.out.println("Element Found at Index "+binary_search(sr_lt,"arjuna"));
        System.out.print("Element Found at Index "+binary_search(sr_lt,"karna"));

    }
}
