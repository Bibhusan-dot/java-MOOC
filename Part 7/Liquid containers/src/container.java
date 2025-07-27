public class container {
    private int container1 = 0;
    private int container2 = 0;

    public void addAmount(int a){
        if(a>0){
            container1 += a;
            if(container1 > 100){
                container1 = 100;
            }
        }
        print();
    }

    public void moveAmount(int a){
        if(a>0){
            container1 -= a;
            container2 += a;
            if(container1-a < 0){
                int ans = container1-a;
                container2 = container1-a+ans;
            }
            if(container2 > 100){
                container2 = 100;
            }
        }

        print();
    }

    public void removeAmount(int a){
        if(a>0){
            if(a>container2){
                container2 = 0;
            }
            container2 -= a;
            if(container2 < 0){
                container2 = 0;
            }
        }
        print();
    }

    public void print(){
        System.out.println("Container 1: "+container1+"/100");
        System.out.println("Container 2: "+container2+"/100");
    }
}
