package Fundamentals_II.Part_8.ShortRecap.AverageOfPositiveNumbers;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double average;
        int count = 0;

        while (true) {
            int input = Integer.valueOf(sc.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                sum += input;
                count++;
            }
        }

        if (sum > 0) {
            average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
