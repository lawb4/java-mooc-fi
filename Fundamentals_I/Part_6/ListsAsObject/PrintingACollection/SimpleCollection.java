package Fundamentals_I.Part_6.ListsAsObject.PrintingACollection;

import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        String countElement;
        String output = "";
        String total = "";

        if (elements.size() == 1) {
            countElement = "element";
        } else countElement = "elements";

        for (String name : elements) {
            total += name + "\n";
            output = "The collection " + this.name + " has " + elements.size() + " " + countElement + "" +
                    ":\n" + total;
        }

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        return output;
    }
}
