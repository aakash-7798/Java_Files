import java.util.*;

public class BFS_and_DFS_Graph {
    public static HashMap<Integer,ArrayList> Get_graph_list(int E,Scanner s)
    {
        HashMap<Integer,ArrayList> hm = new HashMap<>();
        for(int i=0;i<E;i++){
            System.out.print("Enter Vertex and Edge : ");
            String[] v_e = s.nextLine().split(" ");
            int v = Integer.parseInt(v_e[0]);
            int e = Integer.parseInt(v_e[1]);
            if (!hm.containsKey(v)){hm.put(v,new ArrayList<>());}
            if (!hm.containsKey(e)){hm.put(e,new ArrayList<>());}  // this condition is for undirected graph . for directed remove this condition
            if (hm.containsKey(v) && !hm.get(v).contains(e)){hm.get(v).add(e);}
            if (hm.containsKey(e) && !hm.get(e).contains(v)){hm.get(e).add(v);} // this condition is for undirected graph.for directed remove this condition
        }
        return hm;
    }

    public static void BFS(HashMap<Integer,ArrayList> hm ,int root)
    {
        HashSet<Integer> visited = new HashSet<>();
        LinkedList<Integer> q = new LinkedList();
        visited.add(root);
        q.add(root);
        while (q.size()!=0){
            int vertex = (int) q.poll();
            System.out.print(vertex+" ");
            for(var i:hm.get(vertex)){
                if(!visited.contains(i)){
                    visited.add((int) i);
                    q.add((int) i);
                }
            }
        }
        System.out.println();
    }
    public static void DFS(HashSet<Integer> Visited,HashMap<Integer,ArrayList> hm,int root)
    {
        if(!Visited.contains(root)){
            System.out.print(root+" ");
            Visited.add(root);
            for(var i:hm.get(root)){
                DFS(Visited,hm,(int) i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Vertices and Edges : ");
        String[] V_E = s.nextLine().split(" ");
        int V = Integer.parseInt(V_E[0]);
        int E = Integer.parseInt(V_E[1]);
        HashMap<Integer,ArrayList> gal = Get_graph_list(E,s);
        System.out.print("Adjacency List of Graph "+gal+"\n");
        System.out.print("Breadth First Traversal Elements -> ");
        HashSet<Integer> Visited = new HashSet<>();
        BFS(gal,0);
        System.out.print("Depth First Traversal Elements -> ");
        DFS(Visited,gal,0);

//         3 6
//         0 4
//         1 2
//         1 3
//         1 4
//         2 3
//         3 4

//        6 14
//        0 1
//        0 2
//        0 5
//        1 0
//        1 3
//        2 0
//        2 4
//        3 1
//        3 5
//        4 2
//        4 5
//        5 0
//        5 3
//        5 4
    }
}
