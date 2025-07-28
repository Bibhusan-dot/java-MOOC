import java.util.HashMap;

public class Program {
    public void printKeys(HashMap<String,String> hashmap){
        for(String map : hashmap.keySet()){
            System.out.println(map);
        }
    }

    public void printKeysWhere(HashMap<String,String> hashMap, String text){
        for(String map : hashMap.keySet()){
            if(hashMap.get(map)==text){
                System.out.println("Keys is:"+map);
            }
        }
    }

    public void printValueofKeysWhere(HashMap<String,String> hashMap,String text){
        for(String map : hashMap.keySet()){
            if(map.equals(text)){
                System.out.println("Value:"+hashMap.get(map));
            }
        }
    }
}
