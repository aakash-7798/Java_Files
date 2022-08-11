
//  Written By Aakash Nadupalli

//15. Write a Java program to perform the following:
//        i)Sort a list of integers in ascending order using Selection sort.
//        ii)Then searches for a key value(integer) non recursively in the above sorted list
//        using Binary search.


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_15 {
    public static List<Integer> Selection_sort(List<Integer> lst)
    {
        for(int i=0;i<lst.size();i++)
        {
            int m_id = i;
            for (int j=i+1;j<lst.size();j++)
            {
                if(lst.get(m_id)>lst.get(j))
                {
                    m_id = j;
                }
            }
            Collections.swap(lst,i,m_id);
        }
        return lst;
    }
    public static int binary_search(List<Integer> lst,int key)
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
            } else if (key<lst.get(mid)) {
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
        List<Integer> lst = Arrays.asList(5, 58, 35, 69, 8, 7, 56, 23, 21, 25, 44);
        System.out.println("Unsorted List -> "+lst);
        List<Integer> sr_lt = Selection_sort(lst);
        System.out.println("Sorted List -> "+sr_lt);
        System.out.println("Element Found at Index : "+binary_search(sr_lt,56));
        System.out.print("Element Found at Index : "+binary_search(sr_lt,502));

    }
}
