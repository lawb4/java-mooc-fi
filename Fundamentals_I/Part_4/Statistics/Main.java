package Fundamentals_I.Part_4.Statistics;
/*
Part I. Count
Create a class Statistics that has the following functionality
(the file for the class is provided in the in the exercise template):

Part II. Sum and average
Expand the class with the following functionality:

the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
the average method tells the average of the numbers added (the average of an empty number statistics object is 0

Part III. Sum of user input
Write a program that asks the user for numbers until the user enters -1.
The program will then provide the sum of the numbers.

The program should use a Statistics object to calculate the sum.

NOTE: Do not modify the Statistics class in this part.
Instead, implement the program for calculating the sum by making use of it.

Part IV. Multiple sums
Change the previous program so that it also calculates the sum of even and odd numbers.

NOTE: Define three Statistics objects in the program. Use the first to calculate the sum of all numbers,
the second to calculate the sum of even numbers, and the third to calculate the sum of odd numbers

NOTE: Do not change the Statistics class in any way!
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(sc.nextLine());
            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                even.addNumber(input);
            } else if (input % 2 != 0) {
                odd.addNumber(input);
            }

            statistics.addNumber(input);
        }
        System.out.println(statistics.average());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());


        /*statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());*/

    }
}
