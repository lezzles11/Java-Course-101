
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
           ArrayList<String> words = new ArrayList<String>();
        String text = "";
        while (!words.contains(text)) {
            words.add(text);
            System.out.print("Type a word: ");
            text = reader.nextLine(); 
            
        } 
            Collections.sort(words);
            for (String word : words) {    
                System.out.println(word);
            }
        
        }   
}