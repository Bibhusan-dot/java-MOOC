import org.w3c.dom.css.CSSStyleRule;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String,String> h1 = new HashMap<>();
        h1.put("f.e", "for example");
        h1.put("etc.", "and so on");
        h1.put("i.e", "more precisely");

        Program p1 = new Program();

        p1.printKeys(h1);
        p1.printKeysWhere(h1,"more precisely");
        p1.printValueofKeysWhere(h1,"i.e");
    }
}