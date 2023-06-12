package Fundamentals_I.Part_2;
/*
Define a two-parameter method smallest that returns
the smaller of the two numbers passed to it as parameters.
*/

public class Smallest {

    public static int smallest(int number1, int number2) {
        int smallest;

        if (number1 < number2) {
            smallest = number1;
        } else {
            smallest = number2;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}