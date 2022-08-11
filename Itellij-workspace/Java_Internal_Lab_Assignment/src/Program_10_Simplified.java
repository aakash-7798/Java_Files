
//  Written By Aakash Nadupalli

//10. Write a Java program that implements merge sort for sorting a list of names in ascending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_10_Simplified {
    public static List<String> merge(List<String> left,List<String> right)
    {
        List<String> merged = new ArrayList<>();
        int i=0,j=0;
        while (i<left.size() && j<right.size())
        {
            if(left.get(i).compareToIgnoreCase(right.get(j))<=0){
                merged.add(left.get(i));
                i++;
            }
            else{
                merged.add(right.get(j));
                j++;
            }
        }
        merged.addAll(left.subList(i,left.size()));
        merged.addAll(right.subList(j,right.size()));
        return merged;
    }
    public static List<String> merge_sort(List<String> mlst)
    {
        if(mlst.size()<2)
        {
            return mlst;
        }
        int mid = mlst.size()/2;
        List<String> left = merge_sort(mlst.subList(0,mid));
        List<String> right = merge_sort(mlst.subList(mid,mlst.size()));
        return merge(left,right);
    }
    public static void main(String[] args) {
        List<String> mlst = Arrays.asList("bhima","nakula","yudhistira","sahadeva","arjuna","duryodhana","dushasana","vikrana","chitrasena","karna");
        System.out.println("Unsorted List : "+mlst);
        List<String> sorted_mlst = merge_sort(mlst);
        System.out.println("Sorted List : "+sorted_mlst);
    }
}
