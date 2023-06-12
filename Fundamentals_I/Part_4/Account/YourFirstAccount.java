package Fundamentals_I.Part_4.Account;
/*
The exercise template comes with a ready-made class named Account.
The Account object represents a bank account that has balance (i.e. one that has some amount of money in it).

Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance.
NB! Perform all the operations in this exact order.
 */
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAccount = new Account ("Yahor Labanau", 100.0);

        myAccount.deposit(20.0);
        System.out.println(myAccount); // see the @Override method 'toString'
    }
}