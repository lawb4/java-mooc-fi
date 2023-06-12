package Fundamentals_I.Part_2;
/*
Part 1: Printing stars
Define a method called printStars that prints the given number of stars and a line break.

Part 2: Printing a square
Define a method called printSquare(int size) that prints
a suitable square with the help of the printStars method.

Part 3: Printing a rectangle
Write a method called printRectangle(int width, int height) that
prints the correct rectangle by using the printStars method.

Part 4: Printing a triangle
Create a method called printTriangle(int size) that
prints a triangle by using the printStars method.
 */

public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}