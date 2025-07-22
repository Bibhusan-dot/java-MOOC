public class Main {
    public static void main(String[] args) {
        counter c1 = new counter(19);
        System.out.println(c1.value());

        c1.increase();
        System.out.println(c1.value());

        c1.increase(10);
        System.out.println(c1.value());

        c1.decrease();
        System.out.println(c1.value());

        c1.decrease(10);
        System.out.println(c1.value());

    }
}