package Fundamentals_I.Part_2;

/*
Define a method called greatest that takes three numbers
and returns the greatest of them.
If there are multiple greatest values, returning one of them is enough.
Printing will take place in the main program.
*/

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }
        if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
        /*
        int greatest = number1;
        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }
        return greatest;
         */
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}