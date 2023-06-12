package Fundamentals_I.Part_2;

import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negCount = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num < 0) {
                negCount++;
            }
            if (num == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + negCount);
    }
}