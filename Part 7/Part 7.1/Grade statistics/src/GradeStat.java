import java.util.ArrayList;
import java.util.Scanner;

public class GradeStat {
    private ArrayList<Integer> number = new ArrayList<>();
    String str;
    int num;
    Scanner scanner = new Scanner(System.in);
    private int passsedStd=0;

    public void enter(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            str = scanner.next();
            num = Integer.valueOf(str);
            if(num == -1){
                break;
            }
            else if(num < 0){
                continue;
            }
            else if(num >= 0 && num <= 100){
                number.add(num);
            }
        }
        average();
        passingAverage();
        passingPercentage();
        gradeDistribution();
    }

    public void average(){
        int totalSum=0;
        for(int a:number){
            totalSum += a;
        }
        float average = totalSum / (float)number.size();
        System.out.println("Point average (all):"+average);
    }

    public void passingAverage(){
        float passingGrade = 0;
        int j = 0;
        for(int i=0;i<number.size();i++){
            if(number.get(i) >= 50){
                passingGrade += number.get(i);
                j++;
            }
        }
        passingGrade = passingGrade / j;
        passsedStd = j;
        System.out.println("Point average (passing): "+passingGrade);
    }

    public void passingPercentage(){
        int percent = 100 * passsedStd / number.size();
        System.out.println("Pass percentage: "+percent+"%");
    }


    public void gradeDistribution(){
        System.out.println("points\t"+"grade");
        for(int a:number){
            if(a<50){
                System.out.println(a+"\t\t"+"failed");
            }
            else if(a<60){
                System.out.println(a+"\t\t"+"1");
            }
            else if(a<70){
                System.out.println(a+"\t\t"+"2");
            }
            else if(a<80){
                System.out.println(a+"\t\t"+"3");
            }
            else if(a<90){
                System.out.println(a+"\t\t"+"4");
            }
            else if(a>=90){
                System.out.println(a+"\t\t"+"5");
            }
        }
    }
}
