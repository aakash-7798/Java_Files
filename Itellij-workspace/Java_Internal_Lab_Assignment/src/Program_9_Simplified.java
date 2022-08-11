
//  Written By Aakash Nadupalli

//9. Write a Java program that implements merge sort for sorting a list of integers in ascending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_9_Simplified {
    public static List<Integer> merge(List<Integer> left,List<Integer>right)
    {
        List<Integer> merged = new ArrayList<>();
        int i=0,j=0;
        while (i<left.size() && j<right.size())
        {
            if(left.get(i)<=right.get(j)){
                merged.add(left.get(i));
                i++;
            }else {
                merged.add(right.get(j));
                j++;
            }
        }
        merged.addAll(left.subList(i,left.size()));
        merged.addAll(right.subList(j,right.size()));
        return merged;
    }
    public static List<Integer> merge_Sort(List<Integer> mlst)
    {
        if(mlst.size()<2){
            return mlst;
        }
        int mid = mlst.size()/2;
        List<Integer> left = merge_Sort(mlst.subList(0,mid));
        List<Integer> right= merge_Sort(mlst.subList(mid,mlst.size()));
        return merge(left,right);
    }
    public static void main(String[] args) {
        List<Integer> mlst = Arrays.asList(2,25,8,9,7, 8,2, 1, 5, 8, 33, 5, 58, 35, 69, 8, 7, 56, 23, 21, 25, 44, 66, 78, 98);
        System.out.println("Unsorted List :"+mlst);
        List<Integer> sorted_mlst = merge_Sort(mlst);
        System.out.println("Sorted List :"+sorted_mlst);

    }
}
