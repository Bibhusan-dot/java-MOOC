import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while(true){
            System.out.println("Enter identifier:");
            String id = scanner.nextLine();
            System.out.println("Enter name:");
            String name = scanner.nextLine();

            if(id.isEmpty() || name.isEmpty()){
                break;
            }

            boolean bool = false;
            for(Archive a:archive){
                if(a.getIdentifier().equals(id)){
                    bool = true;
                }
            }
            if(!bool){
                archive.add(new Archive(name,id));
            }
        }

        for(Archive a:archive){
            a.getArchive();
        }
    }
}