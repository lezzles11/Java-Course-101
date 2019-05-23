
import java.util.Scanner; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */

public class Average { 
    private int sum;
    private String grade0 = ""; 
    private String grade1 = ""; 
    private String grade2 = ""; 
    private String grade3 = ""; 
    private String grade4 = ""; 
    private String grade5 = ""; 
    private double average; 
    
    public void sum(Scanner reader) {
        while (true) { 
            int input = Integer.parseInt(reader.nextLine()); 
            if (input == -1) {
                break;
            } else if (input <= 29 && input >= 0) {
            grade0 += "*"; 
        } else if (input <= 34 && input >= 30) {
            grade1 += "*";
        } else if (input <= 39 && input >= 35) {
            grade2 += "*"; 
        } else if (input <= 44 && input >= 40) {
            grade3 += "*";
        } else if (input <= 49 && input >= 45) {
            grade4 += "*";
        } else if (input <= 60 && input >= 50) {
            grade5 += "*";
        } 
        }
    }
    
    public void sum() {
        sum = grade1.length() + grade2.length() + grade3.length() + grade4.length() + 
                grade5.length() + grade0.length();
    }
    public double acceptance() {
        sum(); 
        if (sum == 0) {
            average = 0;
        } else {
            average = (sum - grade0.length()) * 100 / sum; 
        } return average; 
    }
    
    public void starList() {
        System.out.println("Grade distribution: ");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);
        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
    }
    
    
}