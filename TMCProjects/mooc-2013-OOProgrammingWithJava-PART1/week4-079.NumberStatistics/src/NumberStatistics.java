
public class NumberStatistics {
    private int amountOfNumbers; 
    private int sum; 
    
    public NumberStatistics(){
        this.amountOfNumbers = 0; 
        this.sum = 0; 
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
    }
    
    public int sum() {
        return this.sum; 
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;  
    }
    
    public double average() {
        double sums = this.sum; 
        double amounts = this.amountOfNumbers; 
        double completed = 0; 
        if (amountOfNumbers >= 1) {
        completed = sums / amounts; 
        } else {
            System.out.println();
        } return completed; 
    }
    
    }
    
    

