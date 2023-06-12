package Fundamentals_II.Part_9.ObjectPolymorphism.Herds;

import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd){
            movable.move(dx,dy);
        }
    }

    public String toString(){
        String output = "";

        for (Movable m : herd) {
            output += m.toString() + "\n";
        }

        return output;
    }
}
