public class Main {
    public static int linearSearch(int[] num,int SearchNum){
        for(int i=0;i<num.length;i++){
            if(SearchNum == num[i]){
                return i;
            }
        }
        return 0;
    }

    public static int BinarySearch(int[] num,int searchNum){
        int firstInd = 0;
        int lastInd = num.length-1;
        int midInd ;
        for(int i=0; i<num.length; i++){
            midInd = firstInd + (lastInd - firstInd) / 2;
            if(num[midInd] > searchNum){
                lastInd = midInd;
            }
            else if(num[midInd] < searchNum){
                firstInd = midInd;
            }
            else{
                return midInd;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] number = {1,5,7,9,18};
        System.out.println(linearSearch(number,9)+" "+number[linearSearch(number,9)]);

        System.out.println(BinarySearch(number,9)+" "+number[BinarySearch(number,9)]);
    }
}