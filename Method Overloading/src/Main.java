public class Main {
    public static void main(String[] args) {

        person p1 = new person(19);
        System.out.println(p1);

        p1.growOlder();
        System.out.println(p1);

        p1.growOlder(10);
        System.out.println(p1);

    }
}