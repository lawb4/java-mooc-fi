package Fundamentals_II.Part_10.CollectionsAsStreams.AverageOfSelectedNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }

        double negative = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

        double positive = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers " +
                "or positive numbers? (n/p)");
        String input = sc.nextLine();
        if (input.equals("n")) {
            System.out.println("Average of the negative numbers: " + negative);
        }
        if (input.equals("p")) {
            System.out.println("Average of the positive numbers: " + positive);
        }
    }
}