package Fundamentals_II.Part_8.ShortRecap.LiquidContainers;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            // Print the contents of the containers
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.valueOf(parts[1]);

            System.out.println();

            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                }

                if (first + amount <= 100) {
                    first += amount;
                } else first = 100;
            }

            if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }

                if (first - amount >= 0) {
                    first -= amount;
                    second += amount;
                } else {
                    second += first;
                    first = 0;
                }

                if (second > 100) {
                    second = 100;
                }
            }

            if (command.equals("remove")) {
                if (second - amount <= 0) {
                    second = 0;
                } else second -= amount;
            }
        }
    }
}
