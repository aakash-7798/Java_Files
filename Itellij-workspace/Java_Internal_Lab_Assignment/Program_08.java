
//  Written By Aakash Nadupalli

//8. Write a Java program that implements quick sort for sorting a list of integers in ascending order.

import java.util.*;
public class Program_08 {
    public static List<Integer> quick_sort(List<Integer> lst)
    {
            if(lst.size()<2)
                  {
                   return lst;
                }

            else
            {
                  List<Integer> All = new ArrayList<>();
                  List<Integer> left = new ArrayList<>();
                  List<Integer> right = new ArrayList<>();

                  int pivot = lst.get(0);

                  for (int i = 1; i < lst.size(); i++)
                     {
                          if (lst.get(i) <= pivot)
                          {
                            left.add(lst.get(i));
                          }
                          else if (lst.get(i) > pivot)
                          {
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
//        List<Integer> lst = Arrays.asList(2,25,8,9,7,8,2,1,5,8,33,5,58,35);
        List<Integer> lst = Arrays.asList(2, 25, 8, 9, 7, 8, 2, 1, 5, 8, 33, 5, 58, 35, 69, 8, 7, 56, 23, 21, 25, 44, 66, 78, 98);
        System.out.print("Unsorted List = "+lst+"\n");
        System.out.print("Sorted List = "+quick_sort(lst));
    }
}
