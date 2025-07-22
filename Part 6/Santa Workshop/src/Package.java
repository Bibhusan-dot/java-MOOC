import java.util.ArrayList;

public class Package {
    private
    ArrayList<Gift> gifts;
    int trackWeight = 0;

    public
    Package(){
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift){
        gifts.add(gift);
    }

    public int totalWeight(){
        for(Gift s:gifts){
            trackWeight += s.weight;
        }
        return trackWeight;
    }
};
