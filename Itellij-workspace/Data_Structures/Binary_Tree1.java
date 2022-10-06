public class Binary_Tree1 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binary_tree{
        static int idx = -1;
        static Node build_tree(int[] values){
            idx++;
            if(values[idx]==-1){
                return null;
            }
            Node root = new Node(values[idx]);
            root.left = build_tree(values);
            root.right = build_tree(values);
            return root;
        }
    }
    static class bst{
        static int sum_of_bst_elements;
        static Node insert(Node bst_root,int value){
            if(bst_root==null){
                bst_root = new Node(value);
                return bst_root;
            }
            if( value > bst_root.data ){
                bst_root.right = insert(bst_root.right,value);
            }
            else {
                bst_root.left = insert(bst_root.left,value);
            }
            return bst_root;
        }

        static Node delete(Node root,int value){
            if(value > root.data){
                root.right = delete(root.right,value);
            }
            else if(value < root.data){
                root.left = delete(root.left,value);
            }
            else {
                if(root.left==null && root.right==null){
                    return null;
                }
                else if(root.left==null){
                    return root.right;
                }
                else {
                    Node IS = inordersuccessor(root.right);
                    root.data = IS.data;
                    root.right = delete(root.right,IS.data);
                }
            }
            return root;
        }
        static Node inordersuccessor(Node root){
            while (root.left!=null){
                root = root.left;
            }
            return root;
        }
    }
    static void pre_order(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        pre_order(root.left);
        pre_order(root.right);
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
//        if(root.data!=-1)
        {System.out.print(root.data+" ");}
        inorder(root.right);
    }
    public static void main(String[] args) {
//        int values[] = {6,4,8,3,-1,-1,5,-1,-1,7,-1,-1,9,-1,-1};
        int values[] = {1,2,4,-1,-1,5,7,-1,-1,8,-1,-1,3,-1,6,-1,9,10,-1,-1,11,-1,-1};
//        int values[] = {1,2,3,4,5,6,7,8,9,10,11};
        Node root = binary_tree.build_tree(values);
        Node root1 = null;
        for (int i=0;i<values.length;i++){
            if(values[i]!=-1){
            root1 = bst.insert(root1,values[i]);}
        }
        System.out.print("Pre_order Traversal -> ");
        pre_order(root);
        System.out.println();
        System.out.print("Inorder Traversal BST -> ");
        inorder(root1);
        System.out.println();
        bst.delete(root1,6);
        System.out.print("Inorder Traversal BST -> ");
        inorder(root1);
        System.out.println();
    }
}
