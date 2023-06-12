package Fundamentals_II.Part_8.ShortRecap.TodoList;

import java.util.Scanner;

public class UserInterface {

    private Scanner sc;
    private TodoList list;

    public UserInterface(Scanner sc, TodoList list) {
        this.sc = sc;
        this.list = list;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = sc.nextLine();

            if (command.equals("stop")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        switch (command) {
            case "add": {
                System.out.print("To add: ");
                String input = sc.nextLine();

                list.add(input);
                break;
            }
            case "list":
                if (list.containsTasks()) {
                    list.print();
                } else System.out.println("TodoList is empty!");
                break;
            case "remove": {
                System.out.print("Which one is removed? ");
                int input = Integer.valueOf(sc.nextLine());

                if (list.contains(input)) {
                    list.remove(input);
                    break;
                } else System.out.println("Error! Nothing to remove");
            }
        }
    }
}
