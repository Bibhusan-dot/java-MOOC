import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private int Totalweight = 0;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(){
        this.maximumWeight = 0;
    }

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
        if(Totalweight<=maximumWeight){
            if(Totalweight+item.getWeight() <= maximumWeight){
                items.add(item);
                Totalweight += item.getWeight();
            }
        }
    }
    public int getTotalweight(){
        return Totalweight;
    }
    public String toString(){
        if(items.size()>1){
            return items.size()+" items "+Totalweight+"kg";
        }
        return items.size()+" item "+Totalweight+"kg";
    }

    public void printItems(){
        for(Item i:items){
            System.out.println(i.getName()+"("+i.getWeight()+")");
        }
    }

    public int heaviestItem(){
        int heaviest = 0;
        for(Item i:items){
            if(i.getWeight()>heaviest){
                heaviest = i.getWeight();
            }
        }

        for(Item i:items){
            if(i.getWeight() == heaviest){
                return heaviest;
            }
        }
        return 0;
    }
}
