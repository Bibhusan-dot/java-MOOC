import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try{
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Paths.get(fileName));

            String name = "";
            int cookingTime = 0;
            ArrayList<String> ingredients = new ArrayList<>();

            for(String line : lines){
                if(line.trim().isEmpty()){
                    recipes.add(new Recipe(name, cookingTime, ingredients));
                    name ="";
                    cookingTime = 0;
                    ingredients = new ArrayList<>();
                } else if (name.isEmpty()) {
                    name = line;
                } else if (cookingTime == 0) {
                    cookingTime = Integer.parseInt(line);
                }
                else{
                    ingredients.add(line);
                }
            }
            if(!name.isEmpty()){
                recipes.add(new Recipe(name,cookingTime,ingredients));
            }
        }
        catch (IOException e){
            System.out.println("Error.");
            return;
        }
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while(true){
            System.out.println("\nEnter command: ");
            String command = scanner.nextLine();

            if(command.equals("list")){
                System.out.println("\nRecipes:");
                for(Recipe recipe : recipes){
                    System.out.println(recipe);
                }
            }

            if(command.equals("find name")){
                System.out.println("Searched word: ");
                String word = scanner.nextLine().toLowerCase();
                System.out.println("\nRecipes:");
                for(Recipe recipe : recipes){
                    if(recipe.getName().toLowerCase().contains(word)){
                        System.out.println(recipe);
                    }
                }
            }

            if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxTime = Integer.parseInt(scanner.nextLine());
                System.out.println("\nRecipes:");
                for(Recipe recipe : recipes){
                    if(recipe.getCookingTime() <= maxTime){
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine().toLowerCase();
                System.out.println(("\nRecipes:"));
                for(Recipe recipe :recipes){
                    for(String ing : recipe.getIngredients()){
                        if(ing.equalsIgnoreCase(ingredient)){
                            System.out.println(recipe);
                            break;
                        }
                    }
                }
            }
        }
    }
}
