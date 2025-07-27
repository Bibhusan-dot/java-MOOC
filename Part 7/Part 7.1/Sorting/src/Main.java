import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MainProgram m1 = new MainProgram();
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("Smallest: " + m1.smallest(numbers));
        System.out.println("Index of the smallest number: " + m1.indexOfSmallest(numbers));
        System.out.println(m1.indexOfSmallestFrom(numbers, 2));
        //m1.swap(numbers,1,5);
        //System.out.println(Arrays.toString(numbers));
        //m1.sort(numbers);


        /*Built in sorting algorithms*/

        int[] numbers1 = {8, 3, 7, 9, 1, 2, 4};
        Arrays.sort(numbers1);
        System.out.print("[");
        for(int i=0;i<numbers1.length;i++){
            System.out.print(numbers1[i]+",");
        }
        System.out.println("]");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(8);
        num.add(3);
        num.add(7);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);


    }
}