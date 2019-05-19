
public class Least {

    public static int least(int number1, int number2) {
        int total; 
        if (number1 > number2) {
            total = number2; 
        } else {
            total = number1;
        }
        return total;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
