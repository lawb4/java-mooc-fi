package Fundamentals_I.Part_4.___FileAndReadingData;

import java.util.Scanner;

/*
Write a program that reads strings from the user until the user inputs the string "end".
As long as the input is not "end", the program should handle the input as an integer and
print the cube of the number provided (i.e., number _ number _ number).
 */
public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            if (input.equals("end")) {
                break;
            }

            int number = Integer.valueOf(input);
            int cube = number * number * number;
            System.out.println(cube);
        }
    }
}
