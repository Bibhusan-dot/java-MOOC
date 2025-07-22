
public class Archive {
    private
    String name;
    String identifier;

    public Archive(String name,String identifier){
        this.name = name;
        this.identifier = identifier;
    }

    public String getIdentifier(){
        return identifier;
    }
    public
    void getArchive(){
        System.out.println("Identifier: "+identifier+" name:"+name);
    }
}
