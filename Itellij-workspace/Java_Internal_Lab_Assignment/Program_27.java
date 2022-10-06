//27. Write a Java program to perform the following:
//        i)create non recursively a binary search tree of integers.
//        ii)search non recursively for an integer key in the above binary search tree.
//        iii)search recursively for an integer key in the above binary search tree.


public class Program_27 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node build_binary_search_tree(Node root, int value)
    {
        Node x = root;
        Node y = null;
        if(root==null){
            return new Node(value);
        }
        while(x!=null){
            y=x;
            if(value<x.data){x=x.left;}
            else {x=x.right;}
        }
        if (value<y.data){y.left = new Node(value);}
        else{y.right=new Node(value);}

        return root;
    }


    public static String search_non_recursively(Node root,int value){
        if(root==null){
            return "Value -> {"+value+"} is Not Found";
        }
        else{
            while (root!=null){
            if(root.data==value){return "Value -> {"+value+"} is found in Binary Search Tree ";}
            if(value<root.data){root = root.left;}
            else{root=root.right;}
        }
        }
        return "Value -> {"+value+"} is Not Found";
    }

    public static String search_recursively(Node root,int value){
        if(root==null){
            return "Value -> {"+value+"} is Not Found";
        }
        else{
        if(root.data==value){return "Value -> {"+value+"} is found in Binary Search Tree ";}
        else if(value<root.data){return search_recursively(root.left,value);}
        else{return search_recursively(root.right,value); }
        }
    }
    public static void main(String[] args) {
    int[] values = {5,8,2,3,1,9,7,6,4};
//                         5
//                    /         \
//                   2           8
//                /   \        /   \
//               1     3      7     9
//                      \   /
//                       4 6
    Node root = null;
    for(int i=0;i< values.length;i++)
    {
        root = build_binary_search_tree(root,values[i]);
    }
    System.out.println(search_non_recursively(root,7));
    System.out.println(search_non_recursively(root,70));
    System.out.println(search_non_recursively(root,6));
    System.out.println(search_recursively(root,1));
    System.out.println(search_recursively(root,3));
    System.out.println(search_recursively(root,30));
}
}
