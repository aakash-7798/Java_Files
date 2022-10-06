public class Heap_Sort {
    public void heapify(int[] arr,int N,int i)
    {
        int root = i,left = 2*i+1,right = 2*i+2;

        if(left<N && arr[left]>arr[root]){
            root = left;
        }

        if(right<N && arr[right]>arr[root]){
            root = right;
        }

        if(root!=i){
            int temp = arr[i];
            arr[i] = arr[root];
            arr[root] = temp;
            heapify(arr,N,root);
        }
    }
    public void heap_sort(int[] arr)
    {
        int N = arr.length;
        for(int i=N/2-1;i>=0;i--) {
            heapify(arr,N,i);
    }
        for(int i=N-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }
    public static void print_array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={7, 40, 25, 42, 4, 78, 96, 5, 88, 3, 2, 1, 8};
        Heap_Sort hs = new Heap_Sort();
        System.out.print("Unsorted List -> ");
        print_array(arr);
        hs.heap_sort(arr);
        System.out.print("Sorted List -> ");
        print_array(arr);


    }
}



