
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal) {
            if (meals.contains(meal)) {
                System.out.println();
            } else {
              meals.add(meal);  
            }
         }
      
    
    
    public void printMeals() {
        for (String meal:meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        this.meals = new ArrayList<String>(); 
    }
    
    

    // add the methods here
}
