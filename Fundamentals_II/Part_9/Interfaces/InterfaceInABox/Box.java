package Fundamentals_II.Part_9.Interfaces.InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> storage;

    public Box(double capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();
    }

    public void add(Packable item) {
        if ((this.weight() + item.weight() <= capacity)) {
            storage.add(item);
        }
    }

    public String checkIfContainsOneItem() {
        if (storage.size() == 1) {
            return "item";
        }
        return "items";
    }

    @Override
    public double weight() {   // use to know the current weight of the Box
        double totalWeight = 0.0;
        for (Packable item : storage) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + storage.size() + " " + checkIfContainsOneItem() +
                ", total weight " + weight() + " kg.";
    }
}
