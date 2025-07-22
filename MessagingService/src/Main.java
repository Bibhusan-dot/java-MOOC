import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MessagingService m1 = new MessagingService();

        m1.add();
        m1.add();
        m1.add();
        m1.add();
        ArrayList<String> lol = m1.getMessages();
        System.out.println("-----------------------------------------------");
        for(String s:lol){
            System.out.println(s);
        }
    }
}