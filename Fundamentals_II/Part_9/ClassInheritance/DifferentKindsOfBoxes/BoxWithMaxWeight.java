package Fundamentals_II.Part_9.ClassInheritance.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (weightOfItems() + item.getWeight() <= capacity) {
            items.add(item);
        }
    }

    private int weightOfItems() {
        int totalWeight = 0;

        for (Item piece : items) {
            totalWeight += piece.getWeight();
        }
        return totalWeight;
    }


    @Override
    public boolean isInBox(Item item) {

        return items.contains(item);
    }
}
