
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String text = "";
        while (!words.contains(text)) {
            words.add(text);
            System.out.print("Type a word: ");
            text = reader.nextLine(); 
            
        } 
            System.out.println("You gave the word " + text + " twice");
        
        }   
}