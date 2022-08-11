public class Binary_Search_Tree {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static Node insert(Node root,int value)
    {
        if(root==null)
        {
            root = new Node(value);
            return root;
        }
        if(root.data>value)
        {
            root.left = insert(root.left,value);
        }
        else
        {
            root.right = insert(root.right,value);
        }
        return root;
    }
    public static void Traverse_Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Traverse_Inorder(root.left);
        System.out.print(root.data+" ");
        Traverse_Inorder(root.right);
    }

    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        } else if (root.data==key) {
            return true;
        } else if (key<root.data) {
            search(root.left,key);
            return true;
        }
        else {
            search(root.right,key);
            return true;
        }
    }
    public static Node delete(Node root,int value)
    {
        if (value<root.data) {
            root.left = delete(root.left,value);
        } else if (value> root.data) {
            root.right = delete(root.right,value);
        }
        else {
            if(root.left ==null && root.right==null)
            {
                return null;
            } else if (root.right==null) {
                return root.left;
            }
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left!=null)
        {
            root = root.left;
        }
        return root;
    }
    public static void PrintInRange(Node root,int x,int y)
    {
        if(root==null)
        {
            return;
        }
        else if(root.data>=x && root.data<=y)
        {
            PrintInRange(root.left,x,y);
            System.out.print(root.data+" ");
            PrintInRange(root.right,x,y);
        }
        else if(x<=root.data)
        {
            PrintInRange(root.left,x,y);
        }
        else {
            PrintInRange(root.right,x,y);
        }
    }
    public static void main(String[] args) {
        int values[] = {5,8,2,3,1,9,7,6,4};
        Node root = null;
        for(int i=0;i<values.length;i++)
        {
            root = insert(root,values[i]);
        }
        System.out.print("Sorting Order of Elements using BST -> ");
        Traverse_Inorder(root);
        System.out.println();
        System.out.print(search(root,1)+"\n");
        delete(root,3);
        Traverse_Inorder(root);
        System.out.println();
        PrintInRange(root,3,8);
    }
}
