public class Person {
    private
    int count = 0;
    String name;
    int weight;

    Person(String name,int weight){
        this.name = name;
        this.weight = weight;
    }

    public
    String getName(){
        return name;
    }
    void count(){
        count++;
    }

    int Counting(){
        return count;
    }
}
