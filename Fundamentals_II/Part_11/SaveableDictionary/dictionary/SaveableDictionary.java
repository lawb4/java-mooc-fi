package Fundamentals_II.Part_11.SaveableDictionary.dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                //System.out.println(parts[0]);
                //System.out.println(parts[1]);
                add(parts[0], parts[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        String result = null;
        for (Map.Entry<String, String> words : dictionary.entrySet()) {
            if (words.getKey().equals(word)) {
                result = words.getValue();
            }
            if (words.getValue().equals(word)) {
                result = words.getKey();
            }
        }
        return result;
    }

    public void delete(String word) {
        //dictionary.remove(word);
        //        dictionary.entrySet().removeIf
        //        (entry -> entry.getKey().equals(word)
        //        || entry.getValue().equals(word));

        Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equals(word) || entry.getValue().equals(word)) {
                iterator.remove();
            }
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (Map.Entry<String, String> word : dictionary.entrySet()) {
                writer.println(word.getKey() + ":" + word.getValue());
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
