import java.util.*;
//import java.io.*;
public class Java1DArrayPart2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Queries : ");
        int queries = s.nextInt();
        for(int i=0;i<=queries;i++)
        {
            int size = s.nextInt();
            int leap = s.nextInt();
            int[] game = new int[size];
            for(int j=0;j<size;j++)
            {
                game[j] = s.nextInt();
            }
            for(int g=0;g<size;g++)
            {
                if(game[g+1]==0)
                {
                    if(game[(g+1)+(leap)]==0 && ( (  (g + 1) + leap ) == (size - 1) || ( ((g + 1) + leap) == (size-2)) ) )
                    {
                        System.out.print("YES");
                    }
                }
            }

        }
    }
}
//
//4               q = 4 (number of queries)
//        5 3             game[] size n = 5, leap = 3 (first query)
//        0 0 0 0 0       game = [0, 0, 0, 0, 0]
//        6 5             game[] size n = 6, leap = 5 (second query)
//        0 0 0 1 1 1     . . .
//        6 3
//        0 0 1 1 1 0
//        3 1
//        0 1 0