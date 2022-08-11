
//  Written By Aakash Nadupalli

//12. Write a Java program to perform the following:
//        i)Sort a list of integers in ascending order using Insertion sort.
//        ii)Then searches for a key value(integer) recursively in the above sorted list
//        using Binary search.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program_12 {
    public static List<Integer> Insertion_sort(List<Integer> lst)
    {
     for(int i=1;i<lst.size();i++)
     {
         int j=i-1;
         while (j>=0)
         {
             if(lst.get(j)>lst.get(j+1))
             {
                 Collections.swap(lst,j,j+1);
             }
             j--;
         }
     }
     return lst;
    }
    public static int binary_search(List<Integer> lst,int lb,int ub,int key)
    {
        int k=0;
        if(lb<=ub) {
            int mid = lb + (ub - lb) / 2;
            if (lst.get(mid) == key) {
                k = mid;
                return mid;
            } else if (key < lst.get(mid)) {
                return binary_search(lst, lb, mid - 1, key);
            } else {
                return binary_search(lst, mid + 1, ub, key);
            }
        }
        else{k=-1;}
        return k;
    }
    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(5,7,2,1,4,9,8,10,25,14,11);
        System.out.print("Unsorted List -> "+lt+"\n");
        List sr_lt = Insertion_sort(lt);
        System.out.print("Sorted List -> "+sr_lt+"\n");
        System.out.print("Element Found at Index "+binary_search(sr_lt,0,sr_lt.size()-1,25));
    }
}
