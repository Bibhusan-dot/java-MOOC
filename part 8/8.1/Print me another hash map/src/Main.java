import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Books> hashMap = new HashMap<>();
        hashMap.put("sense",new Books("Sense and sensibility",1811));
        hashMap.put("prejudice",new Books("Pride and prejudice",1813));

        program p1 = new program();
        p1.printValues(hashMap);
        p1.printValuesIfNameContains(hashMap,"prejudice");

    }
}