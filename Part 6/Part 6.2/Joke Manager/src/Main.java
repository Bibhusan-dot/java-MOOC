import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JokeManager j1 = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        UserInterface u1 = new UserInterface(scanner,j1);
        u1.Start();
    }
}