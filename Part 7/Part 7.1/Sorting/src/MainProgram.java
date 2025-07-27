import java.util.Arrays;

public class MainProgram {
    private int ans;
    public int smallest(int[] a){
        ans = a[0];
        for(int i=0;i<a.length;i++){
            if(ans>a[i]){
                ans = a[i];
            }
        }
        return ans;
    }

    public int indexOfSmallest(int[] a){
        int ans = smallest(a);
        for(int i=0;i<a.length;i++){
            if(ans==a[i]){
                return i;
            }
        }
        return 0;
    }

    public int indexOfSmallestFrom(int[] a,int from){
        ans = a[from];
        for(int i=from;i<a.length;i++){
            if(ans>a[i]){
                ans = a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(ans==a[i]){
                return i;
            }
        }
        return 0;
    }

    public void swap(int[] a,int num1,int num2){
        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] a){
        smallest(a);
        for(int i=0;i<a.length;i++){
            int j  = indexOfSmallestFrom(a,i);
            swap(a,i,j);
        }
    }

}
