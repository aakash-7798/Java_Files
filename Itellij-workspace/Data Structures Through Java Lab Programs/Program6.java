/*
    Created on:: 22nd July 2022
    Author:: Nikhil Bhamidipati
*/


import java.util.*;
import java.lang.Math;


public class Program6 {
    public static int[][] random_matr(int r, int c){
        int[][] result_matr = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                result_matr[i][j] = (int)(Math.random()*(100) + 0);

            }
        }

        return result_matr;
    }

    public static void print_matr(int[][] matr, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.printf("%d ",matr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int[][] matrix_multiplication(int[][] matr1, int r1, int c1, int[][] matr2, int r2, int c2){
        // we know c1=r2
        int[][] ans_matr;
        ans_matr = new int[r1][c2];
        try {

            int p = c1;
            if (p != r2) {
                int[][] dummy_matr = new int[1][1];
                throw new Exception("Matrix Multiplication impossible for given dimensions");
                //return dummy_matr;
            }

            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c2; j++) {

                    int tmp_res = 0;
                    for (int k = 0; k < p; k++) {
                        tmp_res += matr1[i][k] * matr2[k][j];
                    }

                    ans_matr[i][j] = tmp_res;
                }
            }

            //print_matr(ans_matr, r1, c2);

        }
        catch(Exception e){
            System.out.print("Exception caught");
            System.out.println(e.getMessage());
        }

        return ans_matr;
    }

    public static void main(String args[]){


        int r1 = 8;
        int c1 = 9;
        int r2 = 9;
        int c2 = 10;
        int[][] matr1 = random_matr(r1, c1);
        print_matr(matr1, r1, c1);
        System.out.printf("X\n\n");
        int[][] matr2 = random_matr(r2, c2);
        print_matr(matr2, r2, c2);

        System.out.printf("==\n\n");
        int[][] prod_matrix = matrix_multiplication(matr1, r1, c1, matr2, r2, c2);
        print_matr(prod_matrix, r1, c2);




    }
}
