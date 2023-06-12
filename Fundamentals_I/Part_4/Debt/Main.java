package Fundamentals_I.Part_4.Debt;
/*
Create the class Debt that has double-typed instance variables of balance and interestRate.
The balance and the interest rate are passed to the constructor
as parameters public Debt(double initialBalance, double initialInterestRate).

In addition, create the methods public void printBalance() and public void waitOneYear() for the class.
The method printBalance prints the current balance, and the waitOneYear method grows the debt amount.

The debt is increased by multiplying the balance by the interest rate.

You should get the development of a mortgage with an interest rate of one percent as a result of the program.
 */
public class Main {
    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years++;
        }

        mortgage.printBalance();
    }
}
