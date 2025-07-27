public class bird {
    private String name;
    private String latinName;
    private int observations = 0;


    public bird(String name,String latinName){
        this.latinName = latinName;
        this.name = name;
    }

    public void setObservations(){
        observations++;
    }
    public String getName(){
        return name;
    }

    public String getLatinName(){
        return latinName;
    }

    public String toString(){
        return getName()+"("+getLatinName()+"): "+observations+" observations";
    }
}
