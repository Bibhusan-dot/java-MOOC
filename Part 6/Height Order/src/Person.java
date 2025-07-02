public class Person {
    private
    String name;
    private int height;

    public
    Person(String name,int height){
        this.name = name;
        this.height = height;
    }
    Person(){
        this.name="";
        this.height=0;
    }

    String getName(){
        return name;
    }
    int getHeight(){
        return height;
    }
    @Override
    public String toString(){
        return name+"("+height+")";
    }
}
