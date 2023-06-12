package Fundamentals_I.Part_5.ObjectsAndReferences.Money;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {        // you should indicate all the changes with the integers here
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        /*Money result = new Money(euros + addition.euros, cents + addition.cents);
        if (result.cents() > 99) {
            int eurosResult = result.euros() + 1;
            int centsResult = result.cents() - 100;
            return new Money(eurosResult, centsResult);
        }
        return result;*/
        int newCents = cents + addition.cents();
        int newEuros = euros + addition.euros();

        if (newCents > 99) {
            newEuros++;
            newCents -= 100;
        }
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        //return (this.euros < compared.euros || this.cents < compared.cents);

        /*if (euros < compared.euros()){
            return true;
        }

        if (euros > compared.euros()){
            return false;
        }

        return cents < compared.cents();*/

        return (100 * this.euros + this.cents) < (100 * compared.euros + compared.cents);
    }

    public Money minus(Money decreaser) {
        /*Money result = new Money(euros - decreaser.euros, cents - decreaser.cents);
        if (result.cents() < 0) {
            int eurosResult = result.euros() - 1;
            int centsResult = Math.abs(decreaser.cents);
            return new Money(eurosResult, centsResult);
        }

        if (result.euros() < 0) {
            return new Money(0, 0);
        }

        return result;*/

        int newCents = cents - decreaser.cents();
        int newEuros = euros - decreaser.euros();

        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }

        /*Money newMoney = new Money(newEuros, newCents);
        Money zero = new Money(0, 0);

        if (newMoney.lessThan(zero)){
            return zero;
        } else {
            return newMoney;
        }*/

        if (euros < 0) {
            return new Money(0, 0);
        }
        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
