package Fundamentals_I.Part_4.___FileAndReadingData;
/*
Write a program that asks the user for a string, and then prints the contents of
a file with a name matching the string provided.
You may assume that the user provides a file name that the program can find.
 */
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = sc.nextLine();

        try (Scanner files = new Scanner(Paths.get(file))) {
            while (files.hasNextLine()) {
                System.out.println(files.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
