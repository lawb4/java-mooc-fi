package Fundamentals_I.Part_3.UsingStrings;
/*
Write a program that reads names and ages from the user until an empty line is entered.
The name and age are separated by a comma.

After reading all user input, the program prints the name of the oldest person.
You can assume that the user enters at least one person, and the that one of the users is older than the others.
 */

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfOldest = null;
        int age;
        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            age = Integer.valueOf(parts[1]);

            if (age > oldest) {
                oldest = age;
                nameOfOldest = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
