package Fundamentals_I.Part_3.Arrays;
/*
The exercise template already has an array containing numbers.
Complete the program so that it asks the user for a number to search in the array.
If the array contains the given number, the program tells the index containing the number.
If the array doesn't contain the given number, the program will advise that the number wasn't found.
 */

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searching) {
                found = true;
                System.out.println(searching + " is at index " + i + ".");
            }
        }

        if (!found) {
            System.out.println(searching + " was not found.");
        }
    }
}
