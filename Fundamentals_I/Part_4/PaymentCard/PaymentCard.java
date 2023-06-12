package Fundamentals_I.Part_4.PaymentCard;

public class PaymentCard {
    private double balance;
    private final double affordable;
    private final double heartily;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.6;
        this.heartily = 4.6;
    }

    public void eatAffordably() {
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }
    }

    public void eatHeartily() {
        if (this.balance >= heartily) {
            this.balance -= heartily;
        }
    }

    public void addMoney(double amount) {
        /*if (this.balance + amount < 150 && amount > 0) {
            this.balance += amount;
        }
        if (this.balance + amount > 150) {
            this.balance = 150;
        }*/
        if (amount < 0) {
            return;
        }

        this.balance += amount;

        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
