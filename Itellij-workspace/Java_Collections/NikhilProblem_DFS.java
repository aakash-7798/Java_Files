import java.util.*;
public class NikhilProblem_DFS {
    public static void DFS(HashSet Visited,HashMap<Integer,List>hm,int start_vertex)
    {
        if(!Visited.contains(start_vertex) ){
            System.out.print(start_vertex+" ");
            Visited.add(start_vertex);
            for(var i:hm.get(start_vertex)){
                DFS(Visited,hm,(int)i);
            }
        }

    }
    public static void main(String[] args) {
        HashMap<Integer,List> hm = new HashMap<>();
        hm.put(0,Arrays.asList(1,2));
        hm.put(1,Arrays.asList(3,2));
        hm.put(2,Arrays.asList(3,0));
        hm.put(3,Arrays.asList(1,2));
        System.out.print("Hm = "+hm+'\n');
        HashSet<Integer> vstd = new HashSet<>();
        DFS(vstd,hm,0);

    }
}
