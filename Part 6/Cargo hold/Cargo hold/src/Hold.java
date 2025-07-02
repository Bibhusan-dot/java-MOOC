import java.util.ArrayList;

public class Hold {
    private
    int maximumWeight;
    private int totalWeight = 0;
    private int noOfSuitcase=0;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        suitcases.add(suitcase);
        totalWeight += suitcase.getTotalweight();
        noOfSuitcase++;
    }

    public String toString(){
        if(suitcases.size()>1){
            return noOfSuitcase+"suitcases"+"("+totalWeight+")";
        }
        return noOfSuitcase+"suitcase"+"("+totalWeight+")";
    }

    public void printItems(){
        for(Suitcase s:suitcases){
            s.printItems();
        }
    }
}
