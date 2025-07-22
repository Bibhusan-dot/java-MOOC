public class HealthStation {

    public int weight(Person person){
        person.count();
        return person.weight;
    }

    int feed(Person person){
        person.weight = person.weight+10;
        return person.weight;
    }

    public int weighings(Person person){
        return person.Counting();
    }
}
