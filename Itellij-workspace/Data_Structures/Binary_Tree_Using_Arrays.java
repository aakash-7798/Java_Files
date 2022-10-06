
public class Binary_Tree_Using_Arrays {
    static int root = 0;
    static int[] arry ;

    Binary_Tree_Using_Arrays(int size){
        arry = new int[(size*2)+1];
    }

    public void Root(int value){
        arry[0] = value;
    }

    public void Add_to_left(int value,int parent_index){
        int idx = (2*parent_index)+1;
        if(arry[parent_index] == 0)   // default value in array is 0 so if value is 0 then that location is empty
        {
            System.out.print("Parent Not Found ......  So we cannot add element to left\n");
            return;
        }
        else {
            arry[idx] = value;
        }
    }
    public void Add_to_right(int value,int parent_index){
        int idx = (2*parent_index)+2;
        if(arry[parent_index] == 0){
            System.out.print("Parent Not Found ......  So we cannot add element to right\n");
            return;
        }
        else {
            arry[idx] = value;
        }
    }

    public int get_left_child(int parent_index){
        if(arry[parent_index]!=0 && ((2*parent_index)+1)<arry.length){
            return  (2*parent_index)+1;
        }
        return -1;
    }

    public int get_right_child(int parent_index){
        if(arry[parent_index]!=0 && ((2*parent_index)+2)<arry.length){
            return  (2*parent_index)+2;
        }
        return -1;
    }
    public void inorder(int root_index){
        if(arry[root_index]!=0 && root_index<arry.length) {
         inorder(get_left_child(root_index));
         System.out.print(arry[root_index] + " ");
         inorder(get_right_child(root_index));
        }
    }
    public void show_tree(){
        System.out.print("Binary Tree Elements Using Arrays -> ");
        for(int i=0;i<arry.length;i++){
            if(arry[i]!=0){
                System.out.print(arry[i]+" ");
            }
            else {
                System.out.print("-"+" ");
            }
        }
        System.out.println();
    }

    public void get_children_of_each_parent(){
        System.out.print("\nChildren of Each Parent \n");
        System.out.print("Note..If child is -1 then no child...\n");
        if(arry.length==0){System.out.print("Empty Tree");return;}
        for(int i=0;i<arry.length;i++){
        if (2*i+1<arry.length && 2*i+2<arry.length){
            if(arry[2*i+1] == 0 && arry[2*i+2]==0)
//            {System.out.print(arry[i] +" has "+" No left child "+" No right child "+"\n");}
            {System.out.print(arry[i]+" Children are "+-1+" "+-1+"\n");}
            else if(arry[2*i+1] == 0 && arry[2*i+2]!=0)
//            {System.out.print(arry[i] +" has "+" No left child "+" and "+"right child is "+arry[2*i+2]+"\n");}
            {System.out.print(arry[i] +" Children are "+-1+" "+arry[2*i+2]+"\n");}
            else if(arry[2*i+1] != 0 && arry[2*i+2]==0)
//            {System.out.print(arry[i] +" left child is "+arry[2*i+1]+" and "+" No right child "+"\n");}
            {System.out.print(arry[i]+" Children are "+arry[2*i+1]+""+-1+"\n");}
            else{System.out.print(arry[i] +" Children are "+arry[2*i+1]+" "+arry[2*i+2]+"\n");}

        }
    }
    }

    public static void main(String[] args) {

//                                   6
//                                 /   \
//                               4       8
//                             /  \     /  \
//                            3    5   7    9
//                                           \
//                                            10

        Binary_Tree_Using_Arrays BTA = new Binary_Tree_Using_Arrays(7);
        BTA.Root(6);
        BTA.Add_to_left(4,0);
        BTA.Add_to_right(10,2);
        BTA.Add_to_right(8,0);
        BTA.show_tree();
        BTA.Add_to_left(3,1);
        BTA.Add_to_right(5,1);
        BTA.show_tree();
        BTA.Add_to_left(7,2);
        BTA.Add_to_right(9,2);
        BTA.show_tree();
        BTA.get_children_of_each_parent();
//        BTA.Add_to_right(10,6);
//        BTA.show_tree();
//        for(int i=arry.length-1;i>=0;i--){
//            if(2*i+1< arry.length){
//                System.out.print(arry[2*i+1]+" "+arry[(i-1)/2]+" "+arry[2*i+2]+" ");
//            }
//        }
        System.out.print(BTA.get_left_child(1));
        System.out.print(" "+BTA.get_right_child(1)+"\n");
//        for(int i=0;i<arry.length;i++){
//               System.out.print(arry[i]+" ");
//            }
        System.out.print("Inorder Traversal -> ");
        BTA.inorder(0);
//        BTA.get_children_of_each_parent();
    }
}
