public class Binary_Tree {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int value)
        {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }
    static class B_Tree
    {
        static int idx = -1;
        public static Node create_tree(int values[])
        {
            idx++;
            if(values[idx]==-1)
            {
                return null;
            }
            Node new_node = new Node(values[idx]);
            new_node.left = create_tree(values);
            new_node.right = create_tree(values);
            return new_node;
        }
    }
    public static void traverse_preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        traverse_preorder(root.left);
        traverse_preorder(root.right);
    }
    public static void traverse_inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        traverse_inorder(root.left);
        System.out.print(root.data+" ");
        traverse_inorder(root.right);
    }
    public static void traverse_postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        traverse_postorder(root.left);
        traverse_postorder(root.right);
        System.out.print(root.data+" ");
    }



    public static void main(String[] args) {
        int values[] = {4,5,6,-1,-1,3,-1,-1,8,-1,9,-1,-1};
//        int values[] = {4,5,6,3,8,9};
        B_Tree tree = new B_Tree();
        Node root = tree.create_tree(values);
        System.out.print("Pre-Order Traversal -> ");
        traverse_preorder(root);
        System.out.println();
        System.out.print("In-Order Traversal -> ");
        traverse_inorder(root);
        System.out.println();
        System.out.print("Post-Order Traversal -> ");
        traverse_postorder(root);
        System.out.println();
    }
    }
