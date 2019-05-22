import java.util.Scanner;

public class Palindromi {

    
    public static boolean palindrome(String text) {
        // write code here
        String result = "";
 
        // then the rest is copied to it one by one at reverse order
        int length = text.length(); 
        int i = 1; 
        while (i <= length) {
            result += text.charAt(length - i);
            i++;
        }
        if (text.equals(result)) {
            return true; 
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
