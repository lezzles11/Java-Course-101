
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length() - 1; 
        int j = 0; 
        String test = "";
        String next = "";
        while (i >= 0) {
            test = text.substring(i, i+1);
            next = next + test; 
            i--;
        } 
        return next; 
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
