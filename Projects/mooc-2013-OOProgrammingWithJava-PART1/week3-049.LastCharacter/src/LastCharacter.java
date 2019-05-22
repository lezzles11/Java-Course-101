import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        System.out.println("Last Character: " + lastCharacter(text));
    }
    
    public static char lastCharacter (String name) {
        return name.charAt(name.length()-1);
    }
}
