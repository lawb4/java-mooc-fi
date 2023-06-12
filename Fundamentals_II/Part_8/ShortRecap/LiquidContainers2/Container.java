package Fundamentals_II.Part_8.ShortRecap.LiquidContainers2;

public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return volume;
    }

    public void add(int amount) {
        if (amount > 0 && volume + amount <= 100) {
            volume += amount;
        } else volume = 100;
    }

    public void remove(int amount) {
        if (volume - amount > 0 && amount > 0) {
            volume -= amount;
        } else volume = 0;
    }

    @Override
    public String toString() {
        return volume + "/100";
    }
}
