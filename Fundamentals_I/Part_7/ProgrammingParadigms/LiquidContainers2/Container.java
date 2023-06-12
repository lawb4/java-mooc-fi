package Fundamentals_I.Part_7.ProgrammingParadigms.LiquidContainers2;

public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amountToAdd) {
        if (amountToAdd > 0) {
            this.amount += amountToAdd;
        }
        if (this.amount > 100) {
            this.amount = 100;
        }
    }

    public void remove(int amountToRemove) {
        if (amountToRemove > 0) {
            this.amount -= amountToRemove;
        }
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    @Override
    public String toString() {
        return amount + "/" + 100;
    }
}
