import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.println("Type the password: ");
            String enter = reader.nextLine();
            System.out.println("Wrong!");
            if (enter.equals(password)) {
                System.out.println("Right!\n");
                break;
            }
        }
            System.out.println("The secret is: jryy!");
        }
    }

