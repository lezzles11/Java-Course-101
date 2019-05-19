import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        System.out.println("Type the password: ");
        String enter = reader.nextLine();
        if (!(password.equals(enter))) {
            System.out.println("Wrong!");
        } else {
            System.out.println("The secret is: jryy!")
        }
    }
}
