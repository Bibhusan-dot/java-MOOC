import java.util.ArrayList;

public class TodoList {
    ArrayList<String> list = new ArrayList<>();
    public void add(String task){
        list.add(task);
    }
    public void print(){
        int i=1;
        for(String l : list){
            System.out.println(i +": "+l);
            i++;
        }
    }

    public void remove(int number){
        list.remove(number-1);
    }
}
