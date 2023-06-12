package Fundamentals_I.Part_2;
/*
Expand the method sum in the exercise template so that
it calculates and returns the sum of the numbers that are given
as the parameters.
 */
public class Summation {

    public static int sum(int num1, int num2, int num3, int num4) {
        int result = num1 + num2 + num3 + num4;
        return result;
    }

    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }
}
