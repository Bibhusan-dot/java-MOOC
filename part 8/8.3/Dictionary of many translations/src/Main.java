import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DictionaryOfManyTranslations d1 = new DictionaryOfManyTranslations();

        d1.add("lie","thagnu");
        d1.add("bro","bhai");
        d1.add("map","naksa");
        d1.add("lie","dhoka");

        System.out.println(d1.translate("lie"));

        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}