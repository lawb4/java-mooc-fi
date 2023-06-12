package Fundamentals_I.Part_6.UserInterface.ToDoList;

import java.util.Scanner;

public class UserInterface {

    private Scanner sc;
    private ToDoList toDoList;

    public UserInterface(Scanner sc, ToDoList toDoList) {
        this.sc = sc;
        this.toDoList = toDoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = sc.nextLine();

            if (command.equals("stop")) {
                break;
            }

            processCommand(command);
            System.out.println();
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }
        if (command.equals("list")) {
            list();
        }
        if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.print("To add: ");
        String addTask = sc.nextLine();

        toDoList.add(addTask);
    }

    public void list() {
        toDoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int number = Integer.valueOf(sc.nextLine());

        toDoList.remove(number);
    }
}

