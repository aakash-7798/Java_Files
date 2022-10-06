
public class rough2 {
    public static void main(String[] args){
        BoxedNumber[] b1 = new BoxedNumber[5];
        Instantiate(b1);
        BoxedNumber[] b2 = new BoxedNumber[10];
        Instantiate(b2);
        BoxedNumber[] b3 = new BoxedNumber[15];
        Instantiate(b3);
        BoxedNumber[] b4 = new BoxedNumber[20];
        Instantiate(b4);
        get_count_of_count_boxes();
    }
    public static void Instantiate(BoxedNumber[] b){
        int i=0;while (i<b.length){b[i] = new BoxedNumber();i++;}
    }

    public static void get_count_of_count_boxes() {
        System.out.println("Total_Count_Boxes -> "+BoxedNumber.count_boxes);
    }
    public static class BoxedNumber{
        public  static int count_boxes = 0;
        BoxedNumber() {count_boxes ++;}
    }
}
