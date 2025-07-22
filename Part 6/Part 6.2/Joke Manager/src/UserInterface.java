import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    JokeManager joke = new JokeManager();
    public UserInterface(Scanner scanner,JokeManager joke){
        this.scanner = scanner;
        this.joke = joke;
    }

    public void Start(){
        while(true){
            String ch;
            System.out.println("");
            System.out.print("Commands: \n1 - add a joke \n2 - draw a joke \n3 - list jokes \nX - stop");
            System.out.println("");
            ch = scanner.nextLine();

            if(ch.equals("x")){
                break;
            }
            else if(ch.equals("1")){
                System.out.print("Write the joke to be added:");
                String adding = scanner.nextLine();
                joke.addJoke(adding);
            }
            else if(ch.equals("2")){
                System.out.println(joke.drawJoke());
            }
            else if(ch.equals("3")){
                joke.printJokes();
            }
        }
    }
}
