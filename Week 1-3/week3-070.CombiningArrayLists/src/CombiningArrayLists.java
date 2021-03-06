
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {
    

    public static void main(String[] args) {

        // You can change the values while testing
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        // A shorthand for:
        // list1.add(4);
        // list1.add(3);


        Collections.addAll(list2, 5, 10, 7);
        System.out.println(list1);
        System.out.println(list2);


    }
    
    public static void combine(ArrayList<Integer> first, ArrayList<Integer>second) {
        for (int num : second) {
            first.add(num);
        }
    }

}
