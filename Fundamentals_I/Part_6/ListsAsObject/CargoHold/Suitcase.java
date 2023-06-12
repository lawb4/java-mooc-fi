package Fundamentals_I.Part_6.ListsAsObject.CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;
    //private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();
        //this.totalWeight = 0;
    }

    public void addItem(Item itemToAdd) {
        //this.totalWeight += itemToAdd.getWeight();

        if (!(totalWeight() + itemToAdd.getWeight() > this.maxWeight)) {
            this.suitcase.add(itemToAdd);
        }
    }

    public void printItems() {
        for (Item items : suitcase) {
            System.out.println(items);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : suitcase) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (suitcase.isEmpty()) {
            return null;
        }

        Item heaviestIf = suitcase.get(0);
        for (Item item : suitcase) {
            if (heaviestIf.getWeight() < item.getWeight()) {
                heaviestIf = item;
            }
        }
        return heaviestIf;
    }

    public String toString() {
        String toString = this.suitcase.size() + " items (" + totalWeight() + " kg)";

        if (suitcase.size() == 0) {
            toString = "no items (0 kg)";
        }

        if (suitcase.size() == 1) {
            toString = this.suitcase.size() + " item (" + totalWeight() + " kg)";
        }

        return toString;
    }
}
