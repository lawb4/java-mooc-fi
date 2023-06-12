package Fundamentals_I.Part_7.LargerProgrammingExercises.BigYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Database db = new Database();

        UserInterface ui = new UserInterface(sc,db);
        ui.start();

        // need to refactor the one() method in ui
        // I dealt with the task, but if speak about the functionality
        // It would be better to refactor, though

    }
}
