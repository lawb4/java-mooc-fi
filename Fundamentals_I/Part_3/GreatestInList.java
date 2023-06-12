package Fundamentals_I.Part_3;

/*
The exercise template contains a base that reads numbers from the user and adds them to a list.
Reading is stopped once the user enters the number -1.

Continue developing the program so that it finds the greatest number
in the list and prints its value after reading all the numbers.
The programming should work in the following manner.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println();

        int greatest = list.get(0);     // comparing with the item in 0 index
        for (int i = 0; i < list.size(); i++) {
            if (greatest < list.get(i)){
                greatest = list.get(i);
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}