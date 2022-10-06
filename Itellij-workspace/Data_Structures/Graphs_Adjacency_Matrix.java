public class Graphs_Adjacency_Matrix {

    private int Adjacency_Matrix[][] ;
    private int Number_of_Vertices ;

    private int[] Vertices ;

    Graphs_Adjacency_Matrix(int size, int[] Vt)
    {
        Number_of_Vertices = size;
        Adjacency_Matrix = new int[Number_of_Vertices][Number_of_Vertices];

        for(int i=0;i<Number_of_Vertices;i++)
        {
            for(int j=0;j<Number_of_Vertices;j++)
            {
                Adjacency_Matrix[i][j]=-1;
            }
        }

        Vertices = Vt;
    }
    public void add_edge(int edg1,int edg2)
    {
        Adjacency_Matrix[edg1][edg2] = 1;
        Adjacency_Matrix[edg2][edg1] = 1; // Remove this statement if graph is directed
    }

    public void add_edge_with_weights(int edg1,int edg2,int weight)
    {
        Adjacency_Matrix[edg1][edg2] = weight;
        Adjacency_Matrix[edg2][edg1] = weight; // Remove this statement if graph is directed
    }

    public void remove_edge(int edg1,int edg2)
    {
        Adjacency_Matrix[edg1][edg2] = 0;
        Adjacency_Matrix[edg2][edg1] = 0; // Remove this statement if graph is directed
    }

    public void print_adjacency_matrix()
    {
        if(Adjacency_Matrix.length==0){
            System.out.println("Empty Matrix");
            return;
        }
        else {
            System.out.println("Adjacency Matrix ");
            for(int k=0;k<Number_of_Vertices;k++)
            {
                System.out.print("\t"+Vertices[k]+" ");
            }
            System.out.print('\n');
            for(int i=0;i<Number_of_Vertices;i++)
            {
                System.out.print(Vertices[i]+" ");
                for(int j=0;j<Number_of_Vertices;j++)
                {
                    System.out.print("\t"+Adjacency_Matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

//        int[] vt = {0,1,2,3};
        int[] vt = {0,1,2,3,4,5,6,7,8};

        Graphs_Adjacency_Matrix gam = new Graphs_Adjacency_Matrix(vt.length,vt);
//        Graphs_Adjacency_Matrix gam1 = new Graphs_Adjacency_Matrix(4,vt);

//        gam.add_edge(0,1);
//        gam.add_edge(0,2);
//        gam.add_edge(1,2);
//        gam.add_edge(1,1);
//        gam.add_edge(2,0);
//        gam.add_edge(2,3);

//        gam1.add_edge_with_weights(0,1,30);
//        gam1.add_edge_with_weights(0,2,10);
//        gam1.add_edge_with_weights(1,2,25);
//        gam1.add_edge_with_weights(1,1,15);
//        gam1.add_edge_with_weights(2,0,12);
//        gam1.add_edge_with_weights(2,3,27);

        gam.add_edge_with_weights(0,1,4);
        gam.add_edge_with_weights(0,6,7);
        gam.add_edge_with_weights(1,6,11);
        gam.add_edge_with_weights(1,2,9);
        gam.add_edge_with_weights(1,7,20);
        gam.add_edge_with_weights(2,3,6);
        gam.add_edge_with_weights(2,4,2);
        gam.add_edge_with_weights(3,4,10);
        gam.add_edge_with_weights(3,5,5);
        gam.add_edge_with_weights(4,5,15);
        gam.add_edge_with_weights(4,8,5);
        gam.add_edge_with_weights(4,7,1);
        gam.add_edge_with_weights(5,8,12);
        gam.add_edge_with_weights(6,7,1);
        gam.add_edge_with_weights(7,8,3);



        gam.print_adjacency_matrix();
//        gam1.print_adjacency_matrix();
    }
}


//        0 1 4
//        0 6 7
//        1 6 11
//        1 2 9
//        1 7 20
//        2 3 6
//        2 4 2
//        3 4 10
//        3 5 5
//        4 5 15
//        4 8 5
//        4 7 1
//        5 8 12
//        6 7 1
//        7 8 3