package Fundamentals_II.Part_9.ClassInheritance.Warehousing;

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getBalance() {
        return balance;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0d;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0d;
            return allThatWeCan;
        } else {
            this.balance = this.balance - amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}
