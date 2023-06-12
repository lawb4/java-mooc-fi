package Fundamentals_I.Part_6.UserInterface.JokeManager;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJokes() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply";
        }

        Random draw = new Random();
        int index = draw.nextInt(jokes.size());

        String random = jokes.get(index);
       //System.out.println(random);

        return random;
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
