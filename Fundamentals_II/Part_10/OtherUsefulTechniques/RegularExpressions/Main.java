package Fundamentals_II.Part_10.OtherUsefulTechniques.RegularExpressions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checker ch = new Checker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        //ch.isDayOfWeek(input);
        //ch.allVowels(input);
        ch.timeOfDay(input);
    }
}
