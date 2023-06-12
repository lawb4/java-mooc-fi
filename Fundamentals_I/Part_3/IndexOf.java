package Fundamentals_I.Part_3;

/*
The exercise template contains a base that reads numbers from the user and adds them to a list.
Reading is stopped once the user enters the number -1.

Expand the program by adding a functionality that asks the user for a number,
and reports that number's index in the list.
If the number is not found, the program should not print anything.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    // Remember that indexOf() only searches for the FIRST OCCURENCE!

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

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Search for? ");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(input)) {
                System.out.println(list.get(i) + " is at index " + i);
            }
        }
    }
}
