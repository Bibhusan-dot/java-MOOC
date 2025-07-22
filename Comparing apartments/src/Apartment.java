public class Apartment {

    private
    int rooms;
    int square;
    int pricePerSquare;

    public
    Apartment(int rooms,int square,int pricePerSquare){
        this.rooms = rooms;
        this.square = square;
        this.pricePerSquare = pricePerSquare;
    }

    Boolean largerThan(Apartment apt1){
        if(square > apt1.square){
            return true;
        }
        return false;
    }

    int PriceDifference(Apartment apt1){
        int p1,p2;
        p1 = square * pricePerSquare;
        p2 = apt1.square * apt1.pricePerSquare;

        if(p1<p2){
            return p2-p1;
        }

        return p1-p2;
    }

    Boolean moreExpensiveThan(Apartment apartment){
        if(pricePerSquare > apartment.pricePerSquare){
            return true;
        }
        return false;
    }
}
