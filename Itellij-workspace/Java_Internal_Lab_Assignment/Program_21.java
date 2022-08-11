
//  Written By Aakash Nadupalli

//21. Write a Java program to perform the following:
//        i)Sort a list of names in ascending order using Selection sort.
//        ii)Then searches for a key value(name) recursively in the above sorted list
//        using Binary search.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_21 {
    public static List<String> Selection_sort(List<String> lst)
    {
        for(int i=0;i<lst.size();i++)
        {
            int m_id = i;
            for (int j=i+1;j<lst.size();j++)
            {
                if(lst.get(m_id).compareToIgnoreCase(lst.get(j))>0)
                {
                    m_id = j;
                }
            }
            Collections.swap(lst,i,m_id);
        }
        return lst;
    }
    public static int binary_search(List<String> lst,int lb,int ub,String key)
    {
        int k=0;
        if(lb<=ub)
        {
            int mid = lb+(ub-lb)/2;
            if(lst.get(mid)==key)
            {
                k = mid;
                return mid;
            }
            else if (key.compareToIgnoreCase(lst.get(mid))<0) {
                return binary_search(lst,0,mid-1,key);
            }
            else {
                return binary_search(lst,mid+1,ub,key);
            }
        }
        else{
            k=-1;}
        return k;
    }
    public static void main(String[] args) {
        List<String> lt = Arrays.asList("rama","sita","laxmana","bharatha","anjaneya","dasaratha","oormila");
        System.out.print("Unsorted List -> "+lt+"\n");
        List sr_lt = Selection_sort(lt);
        System.out.print("Sorted List -> "+sr_lt+"\n");
        System.out.println("Element Found at Index "+binary_search(sr_lt,0,sr_lt.size()-1,"anjaneya"));
        System.out.print("Element Found at Index "+binary_search(sr_lt,0,sr_lt.size()-1,"rama"));

    }
}
