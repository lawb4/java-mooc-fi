package Fundamentals_I.Part_2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            count++;
            sum += input;
        }
        double average = (double) sum / count;
        System.out.println("Average of the numbers: " + average);
    }
}
