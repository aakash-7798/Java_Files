//28. Write a Java program to perform the following:
//        i)create a binary tree of integers.
//        ii)traverse the above binary tree in inorder.
//        iii)traverse the above binary tree in preorder.
//        iv)traverse the above binary tree in postorder.

public class Program_28 {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
        }
    }

    static class Binary_Tree{
        static int idx=-1;
    public Node create_binary_tree(int[] values)
    {
        idx++;
        if(values[idx]==-1){
            return null;
        }
        Node root = new Node(values[idx]);
        root.left = create_binary_tree(values);
        root.right = create_binary_tree(values);
        return root;
    }
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
//                                 5
//                               /   \
//                             8       2
//                           /   \    /  \
//                          3     1  9    7
//                         / \
//                        6   4

        int[] values = {5,8,3,6,-1,-1,4,-1,-1,1,-1,-1,2,9,-1,-1,7,-1,-1};
        Binary_Tree bt = new Binary_Tree();
        Node root = bt.create_binary_tree(values);
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
