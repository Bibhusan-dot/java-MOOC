import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList t1 = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface u1 = new UserInterface(t1,scanner);
        u1.start();
    }
}