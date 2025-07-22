public class Main {
    public static void main(String[] args) {

        Apartment Dubai = new Apartment(3,100,50);
        Apartment Singapore = new Apartment(3,50,20);

        System.out.println(Dubai.largerThan(Singapore));

        System.out.println(Dubai.PriceDifference(Singapore));

        System.out.println(Dubai.moreExpensiveThan(Singapore));

    }
}