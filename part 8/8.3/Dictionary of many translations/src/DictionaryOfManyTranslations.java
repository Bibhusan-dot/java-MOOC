import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> Dictionary;

    public DictionaryOfManyTranslations(){
        Dictionary = new HashMap<>();
    }
    public void add(String word, String translation){
        this.Dictionary.putIfAbsent(word,new ArrayList<>());
        Dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        if(Dictionary.containsKey(word)){
            return Dictionary.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word){
        if(Dictionary.containsKey(word)){
            Dictionary.remove(word);
        }
    }
}
