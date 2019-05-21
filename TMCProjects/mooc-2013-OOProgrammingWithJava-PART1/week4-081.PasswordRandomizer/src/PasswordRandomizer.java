import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length; 
    private String alphabets = "abcdefghijklmnopqrstuvwxyz";
    private Random random = new Random(); 

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length; 
        this.random = new Random(); 
             
        }
        

    public String createPassword() {
        int i = 0; 
        int charPosition; 
        String password = "";
        while (i < this.length) {
            charPosition = random.nextInt(alphabets.length());
            password += alphabets.charAt(charPosition); 
            i++;
        }
        return password; 
    }
}
