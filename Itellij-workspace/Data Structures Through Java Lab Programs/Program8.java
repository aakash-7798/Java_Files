/*
    Created on:: 22nd July 2022
    Author:: Nikhil Bhamidipati
 */

import java.util.*;
import java.io.*;

public class Program8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the full path of the file you want to check:: ");
        String file_name = s.nextLine();

        
        File f = new File(file_name);
        boolean file_exists = f.isFile();
        boolean is_readable_file = f.canRead();
        boolean is_writable_file = f.canWrite();

        System.out.printf("The file exists:: %s\n", file_exists);
        System.out.printf("The file is readable:: %s\n", is_readable_file);
        System.out.printf("The file is writable file:: %s\n", is_writable_file);

    }
}
