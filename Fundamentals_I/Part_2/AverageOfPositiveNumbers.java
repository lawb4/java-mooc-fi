package Fundamentals_I.Part_2;
/*
Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the
positive numbers (numbers that are greater than zero).

If no positive number is inputted,
the program prints "Cannot calculate the average"
*/
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positives = 0;
        int posSum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }
            if (input < 0) {
                continue;
            }
            if (input > 0) {
                positives++;
                posSum += input;
            }
        }

        if (positives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) posSum / positives;
            System.out.println(average);
        }
    }
}