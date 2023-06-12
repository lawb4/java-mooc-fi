package Fundamentals_I.Part_3;
/*
The exercise template contains a base that reads numbers from the user and adds them to a list.
Reading is stopped once the user enters the number -1.

When reading ends, calculate the average of the numbers in it, and then print that value.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println();

        /*int sum = 0;
        int count = 0;
        for (Integer num : list) {
            sum += num;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Average: " + average);*/
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        double average = (double) sum / list.size();
        System.out.println("Average: " + average);
    }
}