import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> postalCodes = new HashMap<>();
        postalCodes.put(10100,"Bibhusan");
        System.out.println(postalCodes.get(10100));
    }
}