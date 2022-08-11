
//  Written By Aakash Nadupalli

//25. Write a Java program that uses both recursive and non recursive linear search functions
//        to search for an integer key in an array of integer elements.

import java.util.Arrays;
import java.util.List;

public class Program_25 {
    public static int Linear_search_non_recur(List<Integer> lt,int key)
    {
        int k=0;
        for(int i=0;i<lt.size();i++)
        {
            if(lt.get(i)==key)
            {
                k=i;
            }
        }
        return k;
    }
    public static int Linear_search_recur(List<Integer> lt,int lb,int ub,int key)
    {
        if(ub<lb)
        {
            return -1;
        }
        if(lt.get(lb)==key)
        {
            return lb;
        }
        if(lt.get(ub)==key)
        {
            return ub;
        }
        return Linear_search_recur(lt,lb+1,ub-1,key);
    }

    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(5,4,7,8,2,10,15,11,23,58,96,14,45,50,21);
        System.out.println(lt);
        System.out.println(Linear_search_non_recur(lt,10));
        System.out.println(Linear_search_recur(lt,0,lt.size()-1,15));
    }
}
