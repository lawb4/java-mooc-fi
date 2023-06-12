package Fundamentals_II.Part_10.CollectionsAsStreams.PrintingUserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        list.stream()
                .forEach(string -> System.out.println(string));
    }
}