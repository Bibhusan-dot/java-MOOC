public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object object){
        if(!(object instanceof SimpleDate)){
            return false;
        }
        SimpleDate date = (SimpleDate) object;
        if (this.year == ((SimpleDate) object).year &&
                this.month == ((SimpleDate) object).month &&
                this.day == ((SimpleDate) object).day){
            return true;
        }
        return false;
    }
}
