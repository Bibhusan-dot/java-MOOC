public class Main {
    public static void main(String[] args) {
        HealthStation health = new HealthStation();
        Person JohnDoe = new Person("John Doe",70);

        System.out.println("Name: "+JohnDoe.getName()+" weight: "+health.weight(JohnDoe));
        health.feed(JohnDoe);
        health.feed(JohnDoe);
        System.out.println("Name: "+JohnDoe.getName()+" weight: "+health.weight(JohnDoe));
        health.weight(JohnDoe);
        health.weight(JohnDoe);
        System.out.println(health.weighings(JohnDoe));

    }
}