import java.util.ArrayList;

public class Room {
    private ArrayList<Person> TotalPerson = new ArrayList<>();

    public
    void add(Person person){
        TotalPerson.add(person);
    }

    public boolean isEmpty(){
        if(TotalPerson.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return TotalPerson;
    }

    public Person shortest(){
        int shortest=0;
        for(Person p:TotalPerson){
            if(shortest == 0){
                shortest = p.getHeight();
            }
            else if(shortest>p.getHeight()){
                shortest = p.getHeight();
            }
        }

        for(Person p:TotalPerson){
            if(shortest == p.getHeight()){
                return p;
            }
        }
        return null;
    }

    public Person take(){
        int shortest=0;
        for(Person p:TotalPerson){
            if(shortest == 0){
                shortest = p.getHeight();
            }
            else if(shortest>p.getHeight()){
                shortest = p.getHeight();
            }
        }

        for(Person p:TotalPerson){
            if(shortest == p.getHeight()){
                TotalPerson.remove(p);
                return p;
            }
        }
        return null;
    }
}
