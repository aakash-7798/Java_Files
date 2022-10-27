public class NikhilProblem_MaxHeap {
    public static void Heapify(int[] a,int i)
    {
        int root = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<a.length && a[left]>a[root]){
            root = left;
        }
        if(right<a.length && a[right]>a[root]){
            root = right;
        }
        if(root!=i){
            int temp = a[root];
            a[root] = a[i];
            a[i]  = temp;
            Heapify(a,root);
        }
    }
    public static int[] Max_Heap(int[] a){
        for(int i=a.length/2;i>=0;i--){
            Heapify(a,i);
        }
        return a;
    }
    public static void print_array(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] values ={34,56,76,45,32,87,98};
        int[] b = Max_Heap(values);
        print_array(b);

    }
}
