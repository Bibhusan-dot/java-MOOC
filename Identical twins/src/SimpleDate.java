public class SimpleDate {
    private
    String name;
    int date;
    int month;
    int year;

    public
    SimpleDate(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }


    public boolean equals(SimpleDate temp){
        return date == temp.date && month == temp.month && year == temp.year;
    }
}
