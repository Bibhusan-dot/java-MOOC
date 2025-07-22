public class Product {
    private
    String name;
    String location;
    int weight;

    public
    Product(String name){
        this.name = name;
        this.location = "from the shelf";
        this.weight = 1;
    }

    Product(String name, String location){
        this.name =name;
        this.location = location;
        this.weight = 1;
    }

    Product(String name, int weight){
        this.name = name;
        this.location = "from the shelf";
        this.weight = weight;
    }

    @Override
    public String toString(){
        return name +" ("+weight+") "+" can be found "+location;
    }
}

