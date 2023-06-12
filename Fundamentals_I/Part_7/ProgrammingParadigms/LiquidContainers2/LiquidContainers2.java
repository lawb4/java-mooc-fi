package Fundamentals_I.Part_7.ProgrammingParadigms.LiquidContainers2;

import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            System.out.print("> ");

            String input = sc.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                }

                second.add(amount);
                first.remove(amount);
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }

        /*Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);*/
    }
}