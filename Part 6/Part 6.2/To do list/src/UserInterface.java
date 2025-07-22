import java.util.Scanner;

public class UserInterface {
    TodoList t1 = new TodoList();
    Scanner scanner = new Scanner(System.in);
    public UserInterface(TodoList t1, Scanner scanner){
        this.t1 = t1;
        this.scanner = scanner;
    }

    public void start(){
        String s;
        String task;
        while(true){
            System.out.print("Command: ");
            s = scanner.nextLine();

            if(s.equals("stop")){
                break;
            }
            else if(s.equals("add")){
                System.out.println("To add:");
                task = scanner.nextLine();
                t1.add(task);
            }
            else if(s.equals("list")){
                t1.print();
            }
            else if(s.equals("remove")){
                int removeable;
                System.out.println("Enter the index of todo-list to be removed.");
                removeable = scanner.nextInt();
                t1.remove(removeable);
            }
        }
    }
}

