package Fundamentals_I.Part_3.UsingStrings;
/*
Write a program that reads names and birth years from the user until an empty line is entered.
The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years.
If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> longestName = new ArrayList<>();

        String name = "";
        int nameLength = 0;
        double average = 0d;
        int count = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            count++;
            sum += Integer.valueOf(parts[1]);

            if (nameLength < input.length()) {
                nameLength = input.length();
                name = parts[0];
                longestName.add(name);
            }
            average = (double) sum / count;
        }
        /*for (String names : longestName) {
            System.out.println("Longest name: " + names);
        }*/
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);

        /*
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            names.add(parts[0]);
            birthYears.add(Integer.valueOf(parts[1]));
        }

        String longest = names.get(0);
        for (String name : names) {
            if(name.length() > longest.length()) {
                longest = name;
            }
        }
        System.out.println("Longest name: " + longest);

        int sumOfBirthYears = 0;
        for (int year : birthYears) {
            sumOfBirthYears = sumOfBirthYears + year;
        }
        System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());

    }
}
         */
    }
}
