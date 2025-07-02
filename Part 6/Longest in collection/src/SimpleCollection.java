import java.util.ArrayList;

public class SimpleCollection {

    private
    ArrayList<String> collection = new ArrayList<>();
    String character;
    public
    SimpleCollection(String character){
        this.character = character;
    }
    void add(String S){
        collection.add(S);
    }
    String longest(){
        String lamo = new String();
        if(collection.isEmpty()){
            return "null";
        }
        int longest=0;
        for(String a:collection){
            if(a.length()>longest){
                longest = a.length();
            }
        }

        for(String a:collection){
            if(a.length()==longest){
                lamo = a;
                break;
            }
        }
        return lamo;
    }
}
