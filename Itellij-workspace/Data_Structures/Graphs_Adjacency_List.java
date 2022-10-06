import java.util.ArrayList;
import java.util.Arrays;


public class Graphs_Adjacency_List {
    public static void add(ArrayList<ArrayList> al,int v,int e)
    {
        al.get(v).add(e);
        al.get(e).add(v);
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        for(int i=0;i<5;i++){
            al.add(new ArrayList<>());
        }
        add(al, 0, 4);
        add(al, 1, 2);
        add(al, 1, 3);
        add(al, 1, 4);
        add(al, 2, 3);
        add(al, 3, 4);
        for(int k=0;k<5;k++) {
            System.out.print(k + " --> "+al.get(k)+"\n");
        }
    }
}
