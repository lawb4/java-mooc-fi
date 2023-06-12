package Fundamentals_I.Part_7.Algorithms.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] ar = {3, 2, 5, 4, 8};
        System.out.println("Smallest: " + smallest(ar));
        System.out.println();
        System.out.println("Index of the smallest number: " + indexOfSmallest(ar));
        System.out.println();
        System.out.println(indexOfSmallestFrom(ar, 0));
        System.out.println(indexOfSmallestFrom(ar, 1));
        System.out.println(indexOfSmallestFrom(ar, 2));
        System.out.println();

        System.out.println(Arrays.toString(ar));

        swap(ar, 1, 0);
        System.out.println(Arrays.toString(ar));

        swap(ar, 0, 3);
        System.out.println(Arrays.toString(ar));*/

        int[] ar = {8, 3, 7, 9, 1, 2, 4};
        sort(ar);
    }

    public static int smallest(int[] ar) {
        int smallest = ar[0];

        for (int i = 0; i < ar.length; i++) {
            if (smallest > ar[i]) {
                smallest = ar[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] ar) {
        int smallest = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[smallest] > ar[i]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallestFrom(int[] ar, int startIndex) {
        int smallestFrom = startIndex;

        for (int i = startIndex; i < ar.length; i++) {
            if (ar[smallestFrom] > ar[i]) {
                smallestFrom = i;
            }
        }
        return smallestFrom;
    }

    public static void swap(int[] ar, int i1, int i2) {
        int swap = ar[i1];
        ar[i1] = ar[i2];
        ar[i2] = swap;
    }

    public static void sort(int[] ar) {
        int index;

        for (int i = 0; i < ar.length/*-1?*/; i++) {
            index = indexOfSmallestFrom(ar, i);

            swap(ar, i, index);
            System.out.println(Arrays.toString(ar));
        }
    }
}
