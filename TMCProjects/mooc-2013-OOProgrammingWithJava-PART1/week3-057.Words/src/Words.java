
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String text = "";
        while (true) {
            System.out.print("Type a word: ");
            text = reader.nextLine(); 
            words.add(text); 
            if (words.contains(text)) {
            System.out.println("You gave the word " + text + " twice");
            break; 
        } 
        }   
}
}
