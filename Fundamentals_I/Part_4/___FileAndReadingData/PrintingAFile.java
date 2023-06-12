package Fundamentals_I.Part_4.___FileAndReadingData;
/*
Write a program that prints the contents of a file called "data.txt", (modified to course.txt)
such that each line of the file is printed on its own line.
 */
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(Paths.get("d:\\Education\\IT\\Java\\course.txt"))) {
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}