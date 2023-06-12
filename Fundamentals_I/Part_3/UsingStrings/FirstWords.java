package Fundamentals_I.Part_3.UsingStrings;
/*
Write a program that reads user input until an empty line is entered.
For each non-empty line the program splits the string by spaces and prints the first part of the string.
 */
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("")){
                break;
            }
            /*String[] parts = input.split(" ");
            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[0]);
                break;
            }*/
            String[] parts = input.split(" ");
            System.out.println(parts[0]);
        }
    }
}
