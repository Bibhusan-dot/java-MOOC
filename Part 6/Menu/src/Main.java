import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addMeal("Syanako Katti Roll");
        menu.addMeal("Burger House Baneshwor");
        menu.addMeal("Hydrabadi Chicken Biryani");
        menu.printMeal();
        menu.clearMenu();
        menu.printMeal();
    }
}