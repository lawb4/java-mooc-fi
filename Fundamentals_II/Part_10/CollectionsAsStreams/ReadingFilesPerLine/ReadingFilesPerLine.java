package Fundamentals_II.Part_10.CollectionsAsStreams.ReadingFilesPerLine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> song = new ArrayList<>();

        System.out.println("File: ");
        String input = sc.nextLine();

        read(input);

        /*while (true) {
            try (Scanner fileReader = new Scanner(Paths.get(input))) {
                if (fileReader.hasNext()) {
                    String newLine = fileReader.nextLine();
                    if (newLine.isEmpty()){
                        continue;
                    }
                    song.add(newLine);
                }
                read(input);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }*/

    }

    public static List<String> read(String file) {
        List<String> song = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(verso -> song.add(verso));
            song.stream()
                    .forEach(verso -> System.out.println(verso));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return song;

        /*try {
            return Files.lines(Paths.get(file)).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new ArrayList<>();*/
    }
}