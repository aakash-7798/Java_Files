public class Program_8_Using_Arrays {
    public static int[] count_part(int[] arr,int pivot)
    {
        int lt=0,rt=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=pivot){
                lt++;
            }
            else  {
                rt++;
            }
        }
        return new int[]{lt,rt};
    }
    public  static int[] q_sort(int[] arr)
    {
        if(arr.length<2){
            return arr;
        }
        int pivot=arr[0],lt=0,rt=0;
        int[] ct_pt = count_part(arr,pivot);
        int[] All = new int[ct_pt[0]+ct_pt[1]];
        int[] left = new int[ct_pt[0]];
        int[] right = new int[ct_pt[1]];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=pivot){
                left[lt] = arr[i];
                lt++;
            }
            else  {
                right[rt] =arr[i];
                rt++;
            }
        }
        All = merge_arrays(q_sort(left),pivot,q_sort(right));
//        print_array(left);
//        print_array(right);
//        print_array(All);
        return All;
    }

    public static int[] merge_arrays(int[] a,int b,int[] c)
    {
        int [] d = new int[a.length+c.length+1];
        int ct=0;
        for(int i=0;i< a.length;i++)
        {
            d[i] = a[i];
            ct++;
        }
        d[ct++] = b;
        for(int i=0;i<c.length;i++)
        {
            d[ct++] = c[i];
        }
        return d;
    }
    public static void print_array(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        int[] arry = {8, 9, 7, 8, 2, 1, 5, 8, 33, 5};
        int[] arry = {2,25, 8, 9, 7, 8, 2, 1, 5, 8, 33, 5, 58, 35, 69, 8, 7, 56, 23, 21, 25, 44, 66, 78, 98};
        System.out.print("Unsorted Elements : ");
        print_array(arry);
        int[] sorted_arry = q_sort(arry);
        System.out.print("Sorted Elements : ");
        print_array(sorted_arry);
    }
}
