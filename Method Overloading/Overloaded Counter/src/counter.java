public class counter {
    private
    int startValue;

    public
    counter(){
        this.startValue = 0;
    }
    counter(int startValue){
        this.startValue = startValue;
    }
    public
    int value(){
        return startValue;
    }
    void increase(){
        startValue = startValue +1;
    }
    void decrease(){
        startValue = startValue -1;
    }
    void increase(int increaseBy){
        startValue = startValue + increaseBy;
    }
    void decrease(int decreaseBy){
        startValue = startValue - decreaseBy;
    }

    @Override
    public String toString(){
        return String.valueOf(startValue);
    }
}
