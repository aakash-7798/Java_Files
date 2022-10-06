
import java.util.*;
public class Binary_Tree_Using_Linked_List {
    static class Node{
        int data;
        Node left = null;
        Node right = null;
        Node(int data){
            this.data = data;
        }
    }

    static class binary_tree{
        static int idx=-1;
        public static Node create_tree(int[] values)
        {
            idx++;
            if(values[idx]==-1){
                return null;
            }
            Node new_node = new Node(values[idx]);
            new_node.left = create_tree(values);
            new_node.right = create_tree(values);
            return new_node;
        }
    }

    static class binary_search_tree{
        public static Node insert(Node root,int value){
            if(root==null){
                root = new Node(value);
                return root;
            }
            if(value < root.data)
            {
                root.left = insert(root.left,value);
            }
            if(value > root.data)
            {
                root.right  = insert(root.right,value);
            }
            return root;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root)
    {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    static int ct = 0;
    public static void level_order(Node root){
        System.out.println("Level Order Traversal");
        Queue<Node> q = new LinkedList();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node present_node = q.remove();
            if(present_node==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                    ct++;
                }
            }
            else {
                System.out.print(present_node.data+" ");
                if(present_node.left!=null){
                    q.add(present_node.left);
                }
                if(present_node.right!=null){
                    q.add(present_node.right);
                }
            }
        }
        System.out.println();
    }

    public static void print_traversals(Node root){
        Scanner s  = new Scanner(System.in);
        System.out.print("              Traversals List are as Follows\n");
        System.out.print(" 1.PreOrder "+" 2.Inorder "+" 3. PostOrder "+" 4. LevelOrder "+" 5. All\n");
        System.out.print("From above list enter integer : ");
        int value = s.nextInt();
        switch (value){
            case 1:
                System.out.print("Preorder  Traversal -> ");
                preorder(root);
                System.out.println();
                break;
            case 2:
                System.out.print("Inorder  Traversal -> ");
                inorder(root);
                System.out.println();
                break;
            case 3:
                System.out.print("Postorder  Traversal -> ");
                postorder(root);
                System.out.println();
                break;
            case 4:
                level_order(root);
                System.out.print("Height = "+ct);
                break;
            case 5:
                System.out.print("Preorder  Traversal -> ");
                preorder(root);
                System.out.println();
                System.out.print("Inorder   Traversal -> ");
                inorder(root);
                System.out.println();
                System.out.print("Postorder Traversal -> ");
                postorder(root);
                System.out.println();
                level_order(root);
                break;
        }

    }

    public static void main(String[] args) {
        /*   1.                         Binary tree                                            Binary Search Tree
                                              1                                                        1
                                          /      \                                                   /   \
                                        2          6                                                      2
                                     /     \      /  \                                                   /   \
                                    11       4   9    8                                                       11
                                   /   \   /   \                                                            /
                                  3     5  7   10                                                          3
                                                                                                             \
                                                                                                              5
                                                                                                             /  \
                                                                                                            4    7
                                                                                                               /   \
                                                                                                              6     10
                                                                                                                   /
                                                                                                                  9
                                                                                                                 /
                                                                                                                8
            int values[] = {5,8,2,3,1,9,7,6,4};
           2.                       5                                                                        5
                                 /     \                                                                 /        \
                                8       2                                                               3          8
                              /   \    /  \                                                           /   \      /   \
                             3     1  9    7                                                          1    4     6   9
                           /   \                                                                       \          \
                          6    4                                                                        2          78
        */

//        int[] values = {1,2,11,3,-1,-1,5,-1,-1,4,7,-1,-1,10,-1,-1,6,9,-1,-1,8,-1,-1};
        int[] values = {5,8,3,6,-1,-1,4,-1,-1,1,-1,-1,2,9,-1,-1,7,-1,-1};
        Node root =  binary_tree.create_tree(values);
        Node bst_root = null;
        for(int i=0;i<values.length;i++) {
            if (values[i] != -1) {
                bst_root = binary_search_tree.insert(bst_root, values[i]);
            }
        }
//        level_order(root);
//        level_order(bst_root);
//        print_traversals(bst_root);
        print_traversals(root);
    }
}
