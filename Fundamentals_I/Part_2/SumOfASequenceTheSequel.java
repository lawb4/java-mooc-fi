package Fundamentals_I.Part_2;
/*
Implement a program which calculates the sum of a closed interval, and prints it.
Expect the user to write the smaller number first and then the larger number.

You can base your solution to this exercise to the solution of last exercise —
add the functionality for the user to enter the starting point as well.
 */

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.print("The sum is " + sum);
    }
}

