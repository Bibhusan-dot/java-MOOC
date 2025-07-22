import java.util.Scanner;

public class Cubes {
    private
    int cube;
    String number;
    Scanner scanner = new Scanner(System.in);
    public
    void getVal(){
        System.out.println("Enter any number");
        while(true){
            number = scanner.nextLine();
            if(number.isEmpty()){
                continue;
            }
            else if(number == "end"){
                break;
            }
            cube = Integer.parseInt(number);
            cube = cube * cube * cube;
            System.out.println("The cube of give number is "+cube);

        }
    }

}
