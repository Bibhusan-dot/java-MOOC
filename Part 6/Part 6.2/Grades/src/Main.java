public class Main {
    public static void main(String[] args) {

        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(90);
        register.addGradeBasedOnPoints(89);
        register.addGradeBasedOnPoints(60);

        System.out.println("Number of students with grade 5 : " + register.numberOfGrades(5));
        System.out.println("Number of students with grade 4 : " + register.numberOfGrades(4));
        System.out.println("Number of students with grade 3 : " + register.numberOfGrades(3));
        System.out.println("Number of students with grade 2 : " + register.numberOfGrades(2));
        System.out.println("Number of students with grade 1 : " + register.numberOfGrades(1));
        System.out.println("Number of students with grade 0 : " + register.numberOfGrades(0));
    }
}