public class SimpleDate {
    private
    int year;
    int month;
    int day;

    public
    SimpleDate(int day,int month,int year){
        this.year = year;
        this.month = month;
        this.day = day;

    }


    public void out(){
        System.out.println(day + "." + month + "." + year);
    }

    boolean before(SimpleDate compared){
        if(this.year < compared.year){
            return true;
        }
        if(this.year == compared.year && this.month < compared.month){
            return true;
        }
        if(this.year == compared.year && this.month == compared.month && this.day < compared.day){
            return true;
        }

        return false;
    }


    public void advance(){
        this.day++;
        if(this.day > 30){
            this.month++;
        }
        if(this.month > 12){
            this.year++;
        }
    }

    public void advance(int howManyDays){
        this.day = this.day + howManyDays;
        if(this.day > 30){
            this.day = day - 30;
            this.month++;
        }
        if(this.month > 12){
            month = month -12;
            this.year++;
        }
    }

}
