package Fundamentals_I.Part_5.ObjectsAndReferences.BiggestPetShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person ("Leo", lucy);

        System.out.println(leo);
    }
}
