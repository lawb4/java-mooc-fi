package Fundamentals_I.Part_6.UserInterface.SimpleDictionary;

import java.util.Scanner;

public class TextUI {

    private Scanner sc;
    private SimpleDictionary dictionary;

    public TextUI(Scanner sc, SimpleDictionary dictionary) {
        this.sc = sc;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = sc.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = sc.nextLine();
                System.out.print("Translation: ");
                String translation = sc.nextLine();

                dictionary.add(word, translation);
                continue;
            }

            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = sc.nextLine();

                if (dictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                    continue;
                }

                String translation = dictionary.translate(toBeTranslated);

                System.out.println("Translation: " + translation);

                continue;
            }

            System.out.println("Unknown command");
        }
    }
}

/*public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            processCommand(input);
            System.out.println("");
        }

        System.out.println("Bye bye!");
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();

        if (this.dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(word));
        }
    }
} */