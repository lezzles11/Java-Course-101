import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String text = "";
        while (!words.contains(text)) {
            words.add(text);
            System.out.print("Type a word: ");
            text = reader.nextLine(); 
            
        } 
            Collections.reverse(words);
            for (String word : words) {    
                System.out.println(word);
            }
        
        }   
}