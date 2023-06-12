package Fundamentals_I.Part_2;
/*
Part 1: Where to
Write a program which prints the integers from 1 to a number given by the user.

Part 2: Where from
Ask the user for the starting point as well.
If the upper limit is larger than the starting point, nothing is printed.

 */

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int to = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from? ");
        int from = Integer.valueOf(scanner.nextLine());

        for (int i = from; i <= to; i++) {
            if (from > to) {
                break;
            }
            System.out.println(i);
        }
    }
}