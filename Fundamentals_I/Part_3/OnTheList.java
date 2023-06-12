package Fundamentals_I.Part_3;
/*
In the exercise template there is a program that reads inputs from the user until an empty string is entered.
Add the following functionality to it: after reading the inputs one more string is requested from the user.
The program then tell whether that string was found in the list or not.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for? ");
        String searchName = scanner.nextLine();

        if (list.contains(searchName)) {
            System.out.println(searchName + " was found!");
        } else {
            System.out.println(searchName + " was not found!");
        }
    }
}