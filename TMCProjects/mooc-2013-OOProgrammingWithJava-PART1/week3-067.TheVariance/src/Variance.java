import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0; 
        for (int num : list) {
            total = total + num; 
        }
        return total; 
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list); 
        return (double) sum / list.size(); 
    }


    public static double variance(ArrayList<Integer> list) {
        // write code here
        double total = 0.0; 
        double length = 0; 
        for (double num : list) {
            length++; 
            double numSubtract = num - average(list);
            double squared = Math.pow(numSubtract, 2);
            total = total + squared; 
        }
        return total / length;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
