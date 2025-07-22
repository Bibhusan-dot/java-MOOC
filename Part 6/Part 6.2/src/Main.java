import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        wordSet WordSet = new wordSet();
        UserInterface u1 = new UserInterface(WordSet,scanner);
        u1.start();
    }
}