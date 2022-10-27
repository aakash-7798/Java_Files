import java.util.*;

public class Java_Semester_2_External_Quiz_Solutions {
    public static void main(String[] args) {

//3.Write a Java program to perform the following:
//    i)Create a LinkedList collection containing the following string objects(colors):
//    red , blue, green, yellow, black.
//            ii)Using an iterator, scan the above list and remove all elements(colors) that have
//    a string length of less than 5

        System.out.println("Question 3");
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("red", "blue", "green", "yellow", "black"));
        System.out.print("Linked List elements -> "+ll);
        System.out.print("\nLinked List elements after Removal -> ");
        Iterator<String> it = ll.iterator();
        while (it.hasNext()){
            String st = it.next();
            if(st.length()<5){
                it.remove();
            }
            else {
                System.out.print(" "+st+" ");
            }
        }
        System.out.println();


//        4.Write a Java program to perform the following:
//        i)Create an ArrayList collection containing the following string objects(colors):
//        red , blue, green, yellow, black.
//        ii)Use foreach statement that scans the above list and outputs the elements(colors).
//        iii)Using an appropriate iterator, replace the string, “yellow” with string “purple”
//        in the above list.

        System.out.println("\nQuestion 4 ");
        ArrayList<String> al = new ArrayList<>(Arrays.asList("red", "blue", "green", "yellow", "black"));
        System.out.print("Using forEach -> ");
        al.forEach(n -> System.out.print(n+" "));
        System.out.println();

//   8. Write a Java program to perform the following:
//  i)Create a LinkedList collection containing the following string objects(colors):
//  red , blue, green, yellow, black.
//  ii)Using a ListIterator, scan the above list in the reverse order(ie. from last to
//  first) and remove all elements(colors) that have a string length of less than 5

        System.out.println("\nQuestion 8");
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("red", "blue", "green", "yellow", "black"));
        System.out.print("Linked List elements -> "+ll1+"\n");
        System.out.print("Linked List elements after Removal -> ");
        ListIterator<String > lt = ll1.listIterator(ll1.size());
        while (lt.hasPrevious()){
            String st = lt.previous();
            if(st.length()<5){
                lt.remove();
            }
            else{
                System.out.print(" "+st+" ");
            }
        }
        System.out.println();

//    9.  Write a Java program to perform the following:
//    i)Create a HashMap that contains 4 mappings of student names and their end
//       marks in a subject.
//    ii)Obtain a set view of the mappings. Then traverse the set using an iterator and
//      display the contents of the map.

//        Map.of method is only for input upto 10 entries
//        as asked 4 i am using Map.of otherwise Map.entries method is helpful

        System.out.println("\nQuestion 9");
        HashMap<String,Integer> hm = new HashMap<>(Map.of("Rama",92,"Krishna",96,"Hanuma",80,"Arjuna",85));

//        HashMap<String,Integer> hm1 = new HashMap<>(
//                Map.ofEntries(
//                        Map.entry("Rama",92),
//                        Map.entry("Krishna",96),
//                        Map.entry("Hanuma",80),
//                        Map.entry("Arjuna",85)
//                        )
//        );

//        HashMap<String,Integer> hm2 = new HashMap<>();
//        hm2.put("Rama",92);
//        hm2.put("Krishna",96);
//        hm2.put("Hanuma",80);
//        hm2.put("Arjuna",85);

        System.out.print("Using Map.of -> "+hm+"\n");
//        System.out.println("Using Map.ofEntries -> "+hm1);
//        System.out.println("Using put -> "+hm2+"\n");

        System.out.print("Set View of Mappings\n");

        Set<Map.Entry<String,Integer>> es = hm.entrySet();
//        System.out.print(es+"\n");
        Iterator<Map.Entry<String,Integer>> hmentry = hm.entrySet().iterator();
        while (hmentry.hasNext()){
            Map.Entry<String,Integer> et = hmentry.next();
            System.out.println("Key = "+et.getKey()+" and  "+"Value = "+et.getValue());
        }


//        System.out.print("Using forEach Loop");
//        for(Map.Entry<String,Integer> ety: hm1.entrySet()){
//            System.out.println("Entry -> "+ety);
//            System.out.println("Key = "+ety.getKey());
//            System.out.println("Value = "+ety.getValue());
//        }

//        System.out.print("\nUsing forEach method\n");
//        hm.forEach((k,v)-> System.out.println(k+" : "+v));




    }
    }
