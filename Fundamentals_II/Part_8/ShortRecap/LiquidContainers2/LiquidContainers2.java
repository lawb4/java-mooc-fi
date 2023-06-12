package Fundamentals_II.Part_8.ShortRecap.LiquidContainers2;

import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);

            String input = sc.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    c1.add(amount);
                    break;
                case "move":
                    if (amount > c1.contains()) {
                        c2.add(c1.contains());
                        c1.remove(amount);
                    } else {
                        c1.remove(amount);
                        c2.add(amount);
                    }
                    break;
                case "remove":
                    c2.remove(amount);
                    break;
            }
        }
    }
}
