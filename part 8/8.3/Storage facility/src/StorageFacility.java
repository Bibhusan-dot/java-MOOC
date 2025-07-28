import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    StorageFacility(){
        storage = new HashMap<>();
    }

    public void add(String unit, String item){
        storage.putIfAbsent(unit,new ArrayList<>());
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if(storage.containsKey(storageUnit)){
            return storage.get(storageUnit);
        }
        return null;
    }

    public void remove(String storageUnit,String item){
        if(storage.get(storageUnit).contains(item)){
            storage.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> save  = new ArrayList<>();
        for(String unit : storage.keySet()){
            if(!storage.get(unit).isEmpty()){
                save.add(unit);
            }
        }
        return save;
    }
}
