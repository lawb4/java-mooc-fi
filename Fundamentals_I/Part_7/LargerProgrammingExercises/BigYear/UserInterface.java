package Fundamentals_I.Part_7.LargerProgrammingExercises.BigYear;

import java.util.Scanner;

public class UserInterface {

    private Scanner sc;
    private Database db;

    public UserInterface(Scanner sc, Database db) {
        this.sc = sc;
        this.db = db;
    }

    public void start() {

        while (true) {
            System.out.print("? ");
            String command = sc.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("All")) {
                db.all();
            } else if (command.equals("One")) {
                one();
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

    /***/
    // I didn't know about that style of the return implementation !

    /* String askUserInput(String prompt) {
        System.out.print(prompt + " ");

        return sc.nextLine();
    }*/


    public void add() {
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Name in Latin: ");
        String latinName = sc.nextLine();

        db.add(new Bird(name, latinName));
        //db.add(name, latinName);
    }

    public void observation() {
        System.out.print("Bird? ");
        String name = sc.nextLine();

        if (db.containsName(name)) {
            db.observation(name);
        } else {
            System.out.println("Not a bird!");
        }

        /*boolean wasSuccessful = db.observation(name);
        if (!wasSuccessful) {
            System.out.println(name + " is not a bird!");
        }*/
    }

    public void one() {
        System.out.print("Bird? ");
        String name = sc.nextLine();

        db.one(name);
    }
}
