package Fundamentals_II.Part_10.CollectionsAsStreams.PositiveNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-1);
        list.add(-15);
        list.add(23);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println();

        System.out.println(positive(list));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        /*List<Integer> list = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        return list;*/
        return numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
    }
}
