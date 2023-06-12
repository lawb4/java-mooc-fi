package Fundamentals_I.Part_3.Arrays;
/*
The exercise template already contains a program, that creates an array and prints the values of the array twice.
Modify the program to do following: After the first printing, the program should ask for two indices from the user.
The values in these two indices should be swapped, and in the end the values of the array should be printed once again.
 */

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println();

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("Give two indices to swap:");
        int swap1 = Integer.valueOf(scanner.nextLine());
        int swap2 = Integer.valueOf(scanner.nextLine());
///
        int helper = array[swap1];
        array[swap1] = array[swap2];
        array[swap2] = helper;
///
        System.out.println();
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
}