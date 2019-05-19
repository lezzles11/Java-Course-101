
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int min = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int max = Integer.parseInt(reader.nextLine());
        int i = min; 
        int numberToAdd = min - 1; 
        int total = 0;
        while (i <= max) {
            numberToAdd = numberToAdd + 1; 
            total = total + numberToAdd; 
            // 3  = 3 + 3 + 1
            i++; 
           
        }
        System.out.println("The sum is " + total);
    }
}
