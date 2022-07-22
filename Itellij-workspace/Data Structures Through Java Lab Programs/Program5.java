/*
    Created on:: 20th July 2022
    Author:: Nikhil Bhamidipati
 */

// There is some small bug in this code that should be corrected, so its not the final version!


import java.util.*;

public class Program5 {

    public static void main1(String[] args){
        System.out.print("How many Freaking names do you want to sort:: ");
        Scanner s = new Scanner(System.in);

        int arr_size = s.nextInt();

        String[] arr = new String[arr_size];

        //Taking the input
        s.nextLine(); // The '\n' after entering the arr_size input should be discarded

        //System.out.println("Enter the names in comma separated values in a single line");
        //String all_elements_in_one_line = s.nextLine();
        //arr = all_elements_in_one_line.split(", ");
        System.out.println("Enter the strings each in one line");
        for(int i = 0; i < arr_size; i++){
            arr[i] = s.nextLine();
        }

        String[] sorted_arr = stringSort(arr);

        printStringArr(sorted_arr);

    }

    public static void main(String[] args){
        System.out.println({a, b, c})
    }

    public static void printStringArr(String[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%s, ", arr[i]);
        }
        System.out.print("]");
    }
    public static String[] stringSort(String[] arr){
        // Lets implement a simple Comparision type sort, Lets implement Selection sort, which is the simplest sorting algorithm
        int arr_size = arr.length;
        String[] sorted_arr = Arrays.copyOfRange(arr, 0, arr_size);

        // Select the smallest value string in the array
        for(int i = 0; i < arr_size; i++){

            int index_of_smallest_string = smallestStringInRange(arr, i, arr_size);

            replaceElementsByIndex(sorted_arr, i, index_of_smallest_string);
        }

        return sorted_arr;

    }

    public static void replaceElementsByIndex(String[] arr, int i, int j){
        String tmpStr = arr[i];
        arr[i] = arr[j];
        arr[j] = tmpStr;
    }
    public static int smallestStringInRange(String[] arr, int i, int n){
        int index_of_min_string = i;



        for(int j = i+1; j < n; j++){
            // compareTo returns negative value if string1 value is less than string2
            if (arr[index_of_min_string].compareTo(arr[j]) > 0){
                index_of_min_string = j;
                //System.out.printf("I exist and I ran");
            }
        }

        return index_of_min_string;
    }
}
