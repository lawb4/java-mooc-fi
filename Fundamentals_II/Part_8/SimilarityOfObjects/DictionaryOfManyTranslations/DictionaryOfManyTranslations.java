package Fundamentals_II.Part_8.SimilarityOfObjects.DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

//!!!!!!!!!!!!!!!!!!!!!!!!!

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> multitran;

    public DictionaryOfManyTranslations() {
        this.multitran = new HashMap<>();
    }

    public void add(String word, String translation) {
        // adds the translation for the word and preserves the old translations
        // 'cause of ArrayList<String>

        multitran.putIfAbsent(word, new ArrayList<>());

        //ArrayList<String> translations = multitran.get(word);
        //translations.add(translation);
        multitran.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (multitran.get(word) == null) {
            return new ArrayList<>();
        }
        return multitran.get(word);
    }

    public void remove(String word) {
        if (multitran.get(word) == null) {
            System.out.println("No such word!");
        }
        multitran.remove(word);
    }
}
