package Fundamentals_I.Part_6.ListsAsObject.LongestInCollection;

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
        return this.elements;
    }

    public String longest() {
        if (elements.isEmpty()) {
            return null;
        }

        String test = elements.get(0);

        for (String name : elements) {
            if (test.length() < name.length()) {
                test = name;
            }
        }
        return test;
    }
}
