package Fundamentals_I.Part_6.ListsAsObject.CargoHold;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseStorage;

    public Hold (int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcaseStorage = new ArrayList<>();
    }

    public void addSuitcase (Suitcase suitcase){
        if (!(totalWeight() + suitcase.totalWeight() > this.maxWeight)){
            suitcaseStorage.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcaseStorage) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void printItems(){
        for (Suitcase suitcase : suitcaseStorage){
            suitcase.printItems();
        }
    }

    public String toString(){
        return suitcaseStorage.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
