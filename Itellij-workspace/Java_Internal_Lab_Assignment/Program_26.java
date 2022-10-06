//26. Write a Java program to perform the following:
//        i)create recursively a binary search tree of integers.
//        ii)traverse the above binary search tree in inorder.
//        iii)traverse the above binary search tree in preorder.
//        iv)traverse the above binary search tree in postorder.

public class Program_26 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node build_binary_search_tree(Node root,int value)
    {
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<=root.data){
            root.left = build_binary_search_tree(root.left,value);
        }
        else {
            root.right= build_binary_search_tree(root.right,value);
        }
        return root;
    }

    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }


    public static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
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
        for(int  i=0;i< values.length;i++)
        {
            root = build_binary_search_tree(root,values[i]);
        }
        System.out.print("Preorder  Traversal  -> ");
        Preorder(root);
        System.out.println();
        System.out.print("Inorder   Traversal  -> ");
        Inorder(root);
        System.out.println();
        System.out.print("Postorder Traversal  -> ");
        Postorder(root);
        System.out.println();
    }
}
