import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("end")){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}