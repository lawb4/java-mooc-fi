package Fundamentals_II.Part_9.ClassInheritance.DifferentKindsOfBoxes;

public class OneItemBox extends Box {
    //private int capacity;
    //private ArrayList<Item> items;
    private Item item;

    public OneItemBox() {
        //this.items = new ArrayList<>();
        //this.capacity = 1;
    }

    @Override
    public void add(Item item) {
        /*if (capacity == 1) {
            items.add(item);
            capacity++;
        }*/
        if (item == null) {
            this.item = item;
        }

    }

    @Override
    public boolean isInBox(Item item) {
        // return items.contains(item);
        return this.item != null && this.item.equals(item);
    }
}
