import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine(); 
        System.out.println("2nd Word: ");
        String wordTwo = reader.nextLine(); 
        int index = word.indexOf(wordTwo); 
        if (index > 1) {
            System.out.println("nice");
        } else {
        System.out.println("no");
    }
        
    }
}
