package Fundamentals_I.Part_6.UserInterface.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ToDoList list = new ToDoList();
        Scanner sc = new Scanner(System.in);

        UserInterface ui = new UserInterface(sc, list);
        ui.start();*/

        ToDoList list = new ToDoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        list.remove(2);
        list.print();
        list.add("buy raisins");
        list.print();
        list.remove(1);
        list.remove(1);
        list.print();
    }
}
