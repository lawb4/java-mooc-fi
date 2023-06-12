package Fundamentals_II.Part_10.CollectionsAsStreams.LimitedNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(sc.nextLine());
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }

        numbers.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));
    }
}