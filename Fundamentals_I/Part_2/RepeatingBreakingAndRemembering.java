package Fundamentals_I.Part_2;
/*
Part 1: Reading
Implement a program that asks the user for numbers (the program first prints "Write numbers: ")
until the user gives the number -1.
When the user writes -1, the program prints "Thx! Bye!" and ends.

Part 2: Sum of numbers
Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

Part 3: Sum and the number of numbers
Extend the program so that it also prints the number of numbers (not including the -1) the user has written.

Part 4: Average of numbers
Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.

Part 5: Even and odd numbers
Extend the program so that it prints the number of even and odd numbers (excluding the -1).
 */

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers:");

        int sum = 0;
        int count = 0;
        double average = 0d;
        int even = 0;
        int odd = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                even++;
            }
            if (input % 2 != 0) {
                odd++;
            }

            sum += input;
            count++;
            average = (double) sum / count;
            // try sum =+ input /and see what happens
            // it just adds +1 in the end to the amount of input numbers.
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
