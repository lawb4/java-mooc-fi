package Fundamentals_I.Part_6.UserInterface.JokeManager;

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner sc;

    public UserInterface(JokeManager jokes, Scanner sc) {
        this.jokes = jokes;
        this.sc = sc;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = sc.nextLine();
            processCommands(command);

            if (command.equals("X")) {
                break;
            }

            System.out.println();
        }
    }

    public void processCommands(String command) {
        if (command.equals("1")) {
            addJoke();
        }
        if (command.equals("2")) {
            drawJoke();
        }
        if (command.equals("3")) {
            listJokes();
        }
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = sc.nextLine();
        this.jokes.addJoke(joke);
    }

    public void drawJoke() {
        this.jokes.drawJokes();
    }

    public void listJokes() {
        this.jokes.printJokes();
    }
}
