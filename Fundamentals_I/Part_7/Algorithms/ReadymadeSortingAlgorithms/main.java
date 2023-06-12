package Fundamentals_I.Part_7.Algorithms.ReadymadeSortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        int[] ints = {3, 1, 5, 99, 3, 12};
        sort(ints);
        System.out.println(Arrays.toString(ints));

        System.out.println();

        String[] strings = {"bada", "aga", "yaza", "val", "egor"};
        sort(strings);
        System.out.println(Arrays.toString(strings));

        System.out.println();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(10);
        integers.add(-23);
        integers.add(234);
        integers.add(99);
        sortIntegers(integers);
        System.out.println(integers);

        System.out.println();

        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("беруши");
        stringsList.add("егоры");
        stringsList.add("ага");
        stringsList.add("ясный");
        stringsList.add("абав");
        sortStrings(stringsList);
        System.out.println(stringsList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
