public class MOney {
    private int euros;
    private int cents;

    public
    MOney(int euros,int cents){
        this.euros = euros;
        this.cents = cents;
    }

    public int getEuros(){
        return euros;
    }

    public int getCents(){
        return cents;
    }

    public String toString(){
        String zero = "";
        if(cents<=10){
            zero = "0";
        }
        return euros +"."+zero+cents+"e";
    }


    public MOney plus(MOney addition){
       // MOney temp = new MOney(0,0);
        euros = euros + addition.euros;
        cents = cents + addition.cents;
        return this;
    }

    public boolean lessThan(MOney compared){
        if(euros < compared.euros){
            return true;
        }
        if(cents < compared.cents){
            return true;
        }
        return false;
    }

    public MOney minus(MOney decreaser){
        //MOney temp = new MOney(0,0);
        euros = euros - decreaser.euros;
        cents = cents - decreaser.cents;
        return this;
    }
}
