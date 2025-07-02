public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.addStack("Values");
        stack.addStack("1");
        stack.addStack("2");
        stack.addStack("3");
        stack.addStack("10");
        stack.addStack("78");
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
        System.out.println(stack.take());
        System.out.println(stack.values());

        System.out.println(stack.take());
        System.out.println(stack.values());
    }
}