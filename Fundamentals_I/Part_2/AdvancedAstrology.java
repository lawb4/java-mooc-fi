package Fundamentals_I.Part_2;

/*
Part 1: Printing stars and spaces
Define a method called printSpaces(int number) that
produces the number of spaces specified by number.
The method does not print the line break.

You will also have to either copy the printStars method
your previous answer or reimplement it in this exercise template.

Part 2: Printing a right-leaning triangle
Create a method called printTriangle(int size) that uses
printSpaces and printStars to print the correct triangle

Part 3: Printing a Christmas tree
Define a method called christmasTree(int height) that prints the correct Christmas tree.
The Christmas tree consists of a triangle with the specified height as well as the base.
The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom.
The tree is to be constructed by using the methods printSpaces and printStars.
 */
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(2 * i + 1); // спасибо stackOverFlow за аргументы в этой строке :-)
        }

        /*int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i + (i - 1));
            i++;
        }*/

        // Make the bottom of the tree
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
