package Fundamentals_II.Part_8.HashMap.Abbreviations;

import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abb;

    public Abbreviations() {
        this.abb = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (hasAbbreviation(abbreviation)) {
            System.out.println("This abbreviation is already in the dictionary!");
        } else {
            abb.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abb.containsKey(abbreviation);
    }

    /*public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return abb.get(abbreviation);
        }
        return null;
    }*/
    public String findExplanationFor(String abbreviation) {
        return this.abb.get(abbreviation);
    }
}
