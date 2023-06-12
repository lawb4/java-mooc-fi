package Fundamentals_I.Part_4.YourFirstBankTransfer;
/*
The Account from the previous exercise class is also available in this exercise.

Write a program that:

Creates an account named "Matthews account" with the balance 1000
Creates an account named "My account" with the balance 0
Withdraws 100.0 from Matthew's account
Deposits 100.0 to "my account"
Prints both the accounts
 */
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mattAccount = new Account ("Matthews account", 1000);
        Account myAccount = new Account ("My account", 0);

        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println(mattAccount);
        System.out.println(myAccount);
    }
}
