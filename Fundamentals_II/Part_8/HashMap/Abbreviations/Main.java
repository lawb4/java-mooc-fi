package Fundamentals_II.Part_8.HashMap.Abbreviations;

public class Main {
    public static void main(String[] args) {
        Abbreviations abb = new Abbreviations();

        // Whoops, MOOCFi made a mistake....

        abb.addAbbreviation("e.g", "for example");
        abb.addAbbreviation("etc.", "and so on");
        abb.addAbbreviation("i.e", "more precisely");

        String text = "e.g i.e etc. lol";

        for (String part : text.split(" ")) {
            if (abb.hasAbbreviation(part)) {
                part = abb.findExplanationFor(part);
            } else part = null;

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
