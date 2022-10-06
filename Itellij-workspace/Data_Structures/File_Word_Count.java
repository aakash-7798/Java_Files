import java.io.*;
import java.util.StringTokenizer;

public class File_Word_Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("G:\\File1.txt")));
        int Word_Count=0,Character_Count=0,Line_Count=0;
        String line ;
        while ((line = br.readLine()) != null) {
            Line_Count++;
            String[] splt = line.split(" ");
            for(var i:splt){System.out.print(i+" -> "+i.length()+" , ");Word_Count++;Character_Count+=i.length();}
        }
        br.close();
        System.out.print("\nNumber of Lines -> "+Line_Count);
        System.out.print("\nNumber of Words -> "+Word_Count);
        System.out.print("\nNumber of Characters -> "+Character_Count);
    }
}
