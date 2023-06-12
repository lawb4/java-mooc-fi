package Fundamentals_I.Part_4.Film;
/*
Create a film class with the instance variables name (String) and ageRating (int).
Write the constructor public Film(String filmName, int filmAgeRating) for the class,
and also the methods public String name() and public int ageRating().
The first of these returns the film title and the second returns its rating.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(sc.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may watch not the film " + chipmunks.name());
        }
    }
}
