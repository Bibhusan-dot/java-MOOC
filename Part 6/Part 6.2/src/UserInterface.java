import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private wordSet WordSet;

    public UserInterface(wordSet WordSet,Scanner scanner){
        this.scanner = scanner;
        this.WordSet = WordSet;
    }

    public void start(){
        while(true){
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            if(WordSet.contains(word)){
                break;
            }

            WordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
        System.out.println(WordSet.palindromes());
    }

    /*public boolean alreadyEntered(String word){
        for(String str : wordSet){
            if(word.equals(str)){
                return true;
            }
        }
        return false;
    }*/
}
