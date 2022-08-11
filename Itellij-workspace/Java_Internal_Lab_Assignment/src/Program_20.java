
//  Written By Aakash Nadupalli

//20. Write a Java program to perform the following:
//        i)Sort a list of names(strings) in ascending order using Bubble sort.
//        ii)Then searches for a key value (name) recursively in the above sorted list
//        using Binary search.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_20 {
    public static List<String> bubble_sort(List<String> lst)
    {
        int sz = lst.size();
        for(int i=0;i<sz;i++)
        {
            for(int j=0;j<sz-i-1;j++)
            {
                if(lst.get(j).compareToIgnoreCase(lst.get(j+1))>0)
                {
                    Collections.swap(lst,j,j+1);
                }
            }
        }
        return lst;
    }
    public static int binary_search(List<String> lst,int lb,int ub,String key)
    {
        int k=0;
        if(lb<=ub) {
            int mid = lb + (ub - lb) / 2;
            if (lst.get(mid).equals(key)) {
                k = mid;
                return mid;
            } else if (key.compareToIgnoreCase(lst.get(mid))<0) {
                return binary_search(lst, lb, mid - 1, key);
            } else {
                return binary_search(lst, mid + 1, ub, key);
            }
        }
        else{k=-1;}
        return k;
    }
    public static void main(String[] args) {
        List<String> lt = Arrays.asList("rama","sita","laxmana","bharatha","anjaneya","dasaratha","oormila");
        System.out.print("Unsorted List -> "+lt+"\n");
        List sr_lt = bubble_sort(lt);
        System.out.print("Sorted List -> "+sr_lt+"\n");
        System.out.println("Element Found at Index "+binary_search(sr_lt,0,sr_lt.size()-1,"anjaneya"));
        System.out.print("Element Found at Index "+binary_search(sr_lt,0,sr_lt.size()-1,"rama"));

    }
}
