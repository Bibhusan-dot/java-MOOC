import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public
    Stack(){
        this.stack = new ArrayList<>();
    }

    boolean isEmpty(){
        return stack.isEmpty();
    }

    void addStack(String s){
        stack.add(s);
    }

    public ArrayList<String> values(){
        return stack;
    }

    String take(){
        String s = stack.getLast();
        stack.remove(stack.size()-1);
        return s;
    }
}

