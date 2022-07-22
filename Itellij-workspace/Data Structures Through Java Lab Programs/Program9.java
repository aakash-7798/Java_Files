/*
    Created on:: 22nd July 2022
    Author:: Nikhil Bhamidipati 
 */

import java.util.*;
import java.io.*;


public class Program9 {
    public static void main(String[] args){

        try {
            Scanner s = new Scanner(System.in);

            System.out.println("Please enter the path of the file:: ");
            String file_path = s.nextLine();
            //String file_path = "F:\\Nikhil Bhamidipati Files\\Rough Dump\\rubbish.txt";

            File f = new File(file_path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int line_number = 1;
            while ((line = br.readLine()) != null) {
                System.out.printf("%d. ", line_number);
                System.out.println(line);
                line_number += 1;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
