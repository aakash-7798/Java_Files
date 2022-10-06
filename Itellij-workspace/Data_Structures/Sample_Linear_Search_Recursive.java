public class Sample_Linear_Search_Recursive {
        public static int linear_search(int[] a,int lb,int key) {
            int lt = a.length;
            if(lb>=0 && lb<lt){
                if(a[lb]==key){
                    return lb;
                }
            }
            else{
                return -1;
            }
//            if (lb > lt-1) {return -1;}
//            if (key==a[lb]){return lb;}
            return linear_search(a, lb+1, key);
        }
        public static void main(String[] args) {
            int[] a = {4,5,8,2,6,9};
            int ls = linear_search(a,0,16);
            System.out.println("Element found at "+ls);
        }
}
