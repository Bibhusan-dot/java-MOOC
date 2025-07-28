import java.util.HashMap;

public class program {
    public void printValues(HashMap<String,Books> hashMap){
        for(String bookTitle : hashMap.keySet()){
            System.out.println(hashMap.get(bookTitle));
        }
    }

    public void printValuesIfNameContains(HashMap<String,Books> hashMap,String text){
        for(String bookTitle : hashMap.keySet()){
            if(bookTitle.equals(text)){
                System.out.println(hashMap.get(bookTitle));
            }
        }
    }

}
