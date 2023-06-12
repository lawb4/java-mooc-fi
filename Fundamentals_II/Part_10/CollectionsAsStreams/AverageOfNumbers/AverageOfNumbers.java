package Fundamentals_II.Part_10.CollectionsAsStreams.AverageOfNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

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
        double average = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}