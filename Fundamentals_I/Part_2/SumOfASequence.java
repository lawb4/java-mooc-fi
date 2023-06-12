package Fundamentals_I.Part_2;
/*
Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.

Last number? 3          // 1 + 2 + 3 = 6
The sum is 6

Last number? 7          // 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
The sum is 28
 */

import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int input = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.print("The sum is " + sum);
    }
}