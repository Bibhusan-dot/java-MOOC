import java.util.HashMap;

public class IOU {
    private String toWhom;
    private double amount;
    private HashMap<String,Double> hashMap;

    public IOU(){
        this.hashMap = new HashMap<String,Double>();
    }

    public void setSum(String toWhom,double amount){
        this.toWhom = toWhom;
        this.amount = amount;
        hashMap.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        for(String s:hashMap.keySet()){
            if(s.equals(toWhom)){
                return hashMap.get(s);
            }
        }
        return 0;
    }
}
