import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    ArrayList<String> jokes;
    private Random random = new Random();
    public JokeManager(){
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke){
        jokes.add(joke);
    }

    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply";
        }
        int randomIndex = random.nextInt(jokes.size());
        return jokes.get(randomIndex);
    }

    public void printJokes(){
        System.out.println("Printing jokes:");
        for(String s : jokes){
            System.out.print(s);
        }
    }
}
