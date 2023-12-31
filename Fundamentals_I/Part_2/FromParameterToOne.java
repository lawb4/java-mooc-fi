package Fundamentals_I.Part_2;
/*
Create the following method in the exercise template:
public static void printFromNumberToOne(int number).
It should print the numbers from the number passed as a parameter down to one.
Two examples of the method's usage are given below.
 */

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
