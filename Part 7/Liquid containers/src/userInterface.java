import java.util.Scanner;
public class userInterface {
    public void start(){
        container c = new container();
        Scanner scanner = new Scanner(System.in);
        c.print();

        while(true){
            String cmd = scanner.next();
            int amount = scanner.nextInt();

            if(cmd.equals("quit")){
                System.out.println("System ERROR '404' quitting......");
                break;
            }
            else if(cmd.equals("add")){
                c.addAmount(amount);
            }
            else if(cmd.equals("move")){
                c.moveAmount(amount);
            }
            else if(cmd.equals("remove")){
                c.removeAmount(amount);
            }
        }

    }
}
