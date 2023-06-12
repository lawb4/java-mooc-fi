package Fundamentals_I.Part_2;
/*
Create the following method in the exercise template:
public static void printUntilNumber(int number).
It should print the numbers from one to the number passed as a parameter.
Two examples of the method's usage are given below.
*/

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number ; i++) {
            System.out.println(i);
        }
    }
}