package Fundamentals_I.Part_5.ObjectsAndReferences.Archive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = sc.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);
            if (!(archive.contains(item))) {
                archive.add(item);
            }
        }
        System.out.println();

        System.out.println("==Items==");
        for (Archive item : archive) {
            System.out.println(item);
        }
    }
}
