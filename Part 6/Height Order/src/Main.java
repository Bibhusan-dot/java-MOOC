public class Main {
    public static void main(String[] args) {

        Room room = new Room();
        System.out.println("Is room empty: "+room.isEmpty());

        room.add(new Person("Mind",178));
        room.add(new Person("Heart",177));

        System.out.println(room.shortest());
        room.take();
        System.out.println("How to live a life you won't care of others.");
        System.out.println(room.shortest());

    }
}