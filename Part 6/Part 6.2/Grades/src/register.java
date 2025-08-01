import java.util.Scanner;
import java.util.*;
public class register{
    public void start(){
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        while(true){
            System.out.println("Points:");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            int score = Integer.valueOf(input);

            if(score < 0 || score > 100){
                System.out.println("Impossible number.");
                continue;
            }
            register.addGradeBasedOnPoints(score);
        }

        System.out.println("");
        int grade = 5;
        while(grade >= 0){
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            while(stars > 0){
                System.out.println("*");
                stars--;
            }
            System.out.println("");
            grade--;
        }
    }
}
