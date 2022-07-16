////https://stackoverflow.com/questions/23208455/how-to-add-elements-from-string-added-from-console-to-a-list-in-java
//
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Regex {
//    public static void main(String[] args)
//    {
//        Scanner s = new Scanner(System.in);
//        String str = "000.12.12.034";
//        Pattern p = Pattern.compile("(\\d+).(\\d+).(\\d+).(\\d+)");
//        Matcher m = p.matcher(str);
//        if (m.matches()) {
//            System.out.print(m.group(0));
//        }
////        String rgx = "\\d+.\\d+.\\d+.\\d+";
////        System.out.print(Arrays.asList(str.matches(rgx)));
//    }
//}


import java.util.regex.Pattern;
import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {

    String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";

    public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;
}
//1) \\d{1,2} catches any one or two digit number
//
//        2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.
//
//        3) 2[0-4]\\d catches numbers between 200 and 249.
//
//        4) 25[0-5] catches numbers between 250 and 255.
//
//        Note that \d represents digits in regular expressions, same as [0-9]
//000.12.12.034
//121.234.12.12
//23.45.12.56
//00.12.123.123123.123
//122.23
//Hello.IP