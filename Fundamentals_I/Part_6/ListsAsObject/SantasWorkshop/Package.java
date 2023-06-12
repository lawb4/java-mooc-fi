package Fundamentals_I.Part_6.ListsAsObject.SantasWorkshop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftsSack;

    public Package() {
        this.giftsSack = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        giftsSack.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift : giftsSack) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
