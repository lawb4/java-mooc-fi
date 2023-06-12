package Fundamentals_I.Part_3;

/*
Write a program that reads numbers from the user.
When number 9999 is entered, the reading process stops.
After this the program will print the smallest number in the list,
and also the indices where that number is found.
Notice: the smallest number can appear multiple times in the list.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        int input;
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println();
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(smallest)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}