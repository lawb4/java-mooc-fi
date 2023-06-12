package Fundamentals_I.Part_4.___FileAndReadingData;
/*
Write a program that prompts the user for a filename, as well as the upper and
lower bounds for the accepted range of numbers.
Then the program reads the numbers contained in the file (each number is on its own line) and
only accounts for the numbers which are inside the given range.
Finally, the program should print the number of numbers that were inside the given range.

You can convert a string-type integer read from a file into a proper integer using
the command Integer.valueOf (just as when handling input from a user).
 */
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("File? ");
        String file = sc.nextLine();

        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(sc.nextLine());

        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(sc.nextLine());

        int count = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                int line = Integer.valueOf(fileReader.nextLine());
                if (line >= lowerBound && line <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);

        } catch (Exception e) {
            System.out.println("Seems like the file cannot be found.");
        }
    }
}
