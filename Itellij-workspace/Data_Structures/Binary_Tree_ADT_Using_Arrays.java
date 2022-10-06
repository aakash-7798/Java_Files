public class Binary_Tree_ADT_Using_Arrays {
    static int[] bt_array ;
    Binary_Tree_ADT_Using_Arrays(int size) {bt_array = new int[ (2*size)+1 ];}

    public void Root(int value){ bt_array[0] = value;}

    public void add_to_left(int value,int parent_index){
        int idx = 2*parent_index+1;
        if(bt_array[parent_index]==0){
            System.out.print("\nParent Not Found ......  So we cannot add element to left\n");
            return;
        }
        else{
            bt_array[idx]=value;
        }
    }

    public void add_to_right(int value,int parent_index){
        int idx = 2*parent_index+2;
        if(bt_array[parent_index]==0){
            System.out.print("\nParent Not Found ......  So we cannot add element to left\n");
            return;
        }
        else{
            bt_array[idx]=value;
        }
    }
    public int get_left_child(int parent_index)
    {
        if(bt_array[parent_index]!=0 && ((2*parent_index)+1)<bt_array.length)
        {return (2*parent_index)+1;}
        return -1;
    }
    public int get_right_child(int parent_index)
    {
        if(bt_array[parent_index]!=0 && ((2*parent_index)+2)<bt_array.length)
        {return (2*parent_index)+2;}
        return -1;
    }

    public int get_parent(int child_index){
        if(child_index>0 && child_index<bt_array.length){return ((child_index-1)/2);}
        return -1;
    }
    public void preorder(int index)
    {
        if(bt_array[index]!=0 && index< bt_array.length){
            System.out.print(bt_array[index]+" ");
            preorder(get_left_child(index));
            preorder(get_right_child(index));
        }
    }
    public void inorder(int index)
    {
        if(bt_array[index]!=0 && index< bt_array.length){
            inorder(get_left_child(index));
            System.out.print(bt_array[index]+" ");
            inorder(get_right_child(index));
        }
    }
    public void postorder(int index)
    {
        if(bt_array[index]!=0 && index< bt_array.length){
            postorder(get_left_child(index));
            postorder(get_right_child(index));
            System.out.print(bt_array[index]+" ");
        }
    }

    public void BST(int[] values)
    {

    }

    public void print_array()
    {
        System.out.print("Array Elements -->  ");
        for (int i=0;i< bt_array.length;i++){if(bt_array[i]!=0)System.out.print(bt_array[i]+" ");}
    }

    public static void main(String[] args) {

//                                 5
//                               /   \
//                             8       2
//                           /   \    /  \
//                          3     1  9    7
//                         / \
//                        6   4
//
//        Binary_Tree_ADT_Using_Arrays BT = new Binary_Tree_ADT_Using_Arrays(9);
//        BT.Root(5);
//        BT.add_to_left(8,0);
//        BT.print_array();
//        BT.add_to_left(2,2);  // this is not possible as we have root and only its left child which is at index 1
//        BT.add_to_right(2,0);
//        BT.add_to_left(3,1);
//        BT.add_to_right(1,1);
//        BT.add_to_left(9,2);
//        BT.add_to_right(7,2);
//        BT.add_to_left(6,3);
//        BT.add_to_right(4,3);
//        BT.print_array();
//        System.out.println();
//        System.out.print("Preorder Traversal  -->  ");
//        BT.preorder(0);
//        System.out.println();
//        System.out.print("Inorder Traversal   -->  ");
//        BT.inorder(0);
//        System.out.println();
//        System.out.print("Postorder Traversal -->  ");
//        BT.postorder(0);
//        System.out.println();
//        System.out.print("Parent of "+bt_array[6]+" is "+bt_array[BT.get_parent(6)]+"\n");
//        System.out.print("Parent of "+bt_array[1]+" is "+bt_array[BT.get_parent(1)]);


//                                  or

//        int values[] = {5,8,2,3,1,9,7,6,4};
//        int values[] = {1,2,4,5,7,8,3,6,9,10,11};
        int values[] = {1,2,6,11,4,9,8,3,5,7,10};
        Binary_Tree_ADT_Using_Arrays BT = new Binary_Tree_ADT_Using_Arrays(values.length);
        for (int i=0;i< values.length;i++){bt_array[i] = values[i];}
        System.out.print("Array Elements -->  ");
        for (int i=0;i< bt_array.length;i++){System.out.print(bt_array[i]+" ");}
        System.out.println();
        System.out.print("Preorder Traversal  -->  ");
        BT.preorder(0);
        System.out.println();
        System.out.print("Inorder Traversal   -->  ");
        BT.inorder(0);
        System.out.println();
        System.out.print("Postorder Traversal -->  ");
        BT.postorder(0);
        System.out.println();
    }
}
