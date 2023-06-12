package Fundamentals_II.Part_8.ShortRecap.TodoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList list = new TodoList();

        UserInterface ui = new UserInterface(sc, list);
        ui.start();
    }
}
