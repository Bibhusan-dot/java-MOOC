import java.util.ArrayList;

public class Menu {
    private ArrayList<String> Meal;

    public
    Menu(){
        this.Meal = new ArrayList<>();
    }

    void addMeal(String meal){
        Meal.add(meal);
    }

    void printMeal(){
        System.out.println("Menu:\n");
        for(String M:Meal){
            System.out.println(M);
        }
    }

    void clearMenu(){
        Meal.clear();
    }
}
