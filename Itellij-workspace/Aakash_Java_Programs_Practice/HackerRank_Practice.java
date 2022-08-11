import java.util.*;
public class HackerRank_Practice {
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    String str[] = new String[3];
    for(int i=0;i<str.length;i++)
    {
        str[i] = s.nextLine();
    }
    String[] a = String.valueOf(str[0]).split(" ",2);
        String a_part1 = a[0];
        String a_part2 = String.format("%03d",Integer.parseInt(String.valueOf(a[1])));
    String[] b = String.valueOf(str[1]).split(" ",2);
        String b_part1 = b[0];
        String b_part2 = String.format("%03d",Integer.parseInt(String.valueOf(b[1])));
    String[] c = String.valueOf(str[2]).split(" ",2);
        String c_part1 = c[0];
        String c_part2 = String.format("%03d",Integer.parseInt(String.valueOf(c[1])));
   System.out.println("================================");
        System.out.println(a_part1+" ".repeat(15 - (a_part1.length()))+a_part2);
        System.out.println(b_part1+" ".repeat(15 - (b_part1.length()))+b_part2);
        System.out.println(c_part1+" ".repeat(15 - (c_part1.length()))+c_part2);
   System.out.print("================================");
    }
}
