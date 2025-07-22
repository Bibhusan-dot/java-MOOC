import java.util.ArrayList;
import java.util.Scanner;

public class MessagingService {
    private
    ArrayList<String> message = new ArrayList<>();
    String s;

    public
    Scanner scanner = new Scanner(System.in);
    void setMessage(){
        System.out.println("Enter message ");
        s = scanner.nextLine();
    }

    void add(){
        setMessage();
        message.add(s);
    }

    ArrayList<String> getMessages(){
        return message;
    }
}
