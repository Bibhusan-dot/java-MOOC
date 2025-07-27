import java.util.ArrayList;
import java.util.Scanner;

public class birdDatabase {
    private ArrayList<bird> b1 = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void start(){
        while(true){
            System.out.println("?");
            String str = scanner.nextLine();
            if(str.equals("Add")){
                System.out.println("Name:");
                str = scanner.nextLine();
                System.out.println("Name in Latin:");
                String str1 = scanner.nextLine();

                b1.add(new bird(str,str1));
            }
            else if(str.equals("Observation")){
                System.out.println("Bird?");
                str = scanner.nextLine();
                for(bird b : b1){
                    if(str.equals(b.getName())){
                        b.setObservations();
                    }
                }
            }
            else if(str.equals("All")){
                for(bird b:b1){
                    System.out.println(b);
                }
            }
            else if(str.equals("quit")){
                break;
            }
            else if(str.equals("One")){
                b1.get(0);
            }
        }
    }
}
