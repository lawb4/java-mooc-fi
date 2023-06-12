package Fundamentals_I.Part_5.ObjectsAndReferences.ComparingApartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;

        if (thisPrice > comparedPrice) {
            return thisPrice - comparedPrice;
        } else return comparedPrice - thisPrice;

        //return Math.abs(thisPrice - comparedPrice);
        // you could have created a separate price() method for not to write this. and compared.
    }

    public boolean moreExpensiveThan (Apartment compared){
        return this.pricePerSquare > compared.pricePerSquare;
    }
}
