package Fundamentals_II.Part_10.InterfaceComparable.LiteracyComparison;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("File: ");

        String file = sc.nextLine();
        read(file);

    }

    public static void read(String file) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .forEach(verso -> lines.add(verso));
            lines.stream()
                    .sorted((l1, l2) -> {
                                String[] pieces1 = l1.split(",");
                                String[] pieces2 = l2.split(",");
                                return pieces1[5].trim().compareTo(pieces2[5].trim());
                            }
                    ).forEach(p -> {
                String[] pieces = p.split(",");
                //String gender = pieces[2].trim();

                if (p.contains("female")) {
                    pieces[2] = "female";
                } else {
                    pieces[2] = "male";
                }

                System.out.println(pieces[3] + " (" + pieces[4] + "), " + pieces[2] + ", " + pieces[5]);
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Result> results = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .map(a -> new Result(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
                    .forEach(t -> results.add(t));
        } catch (IOException ex) {
            System.out.println("Error reading file.");
        }

        results.stream().sorted((t1, t2) -> {
            if (t1.getLiteracyPercent() > t2.getLiteracyPercent()) {
                return 1;
            }
            if (t1.getLiteracyPercent() < t2.getLiteracyPercent()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
 */

/*public class Result {

    private String sex;
    private String country;
    private int year;
    private double literacyPercent;

    public Result(String sex, String country, int year, double literacyPercent) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
    }
}*/