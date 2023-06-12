package Fundamentals_I.Part_4.___FileAndReadingData;
/*
Write a program that prompts the user for a filename, after which it reads the match statistics from the file.
The program then prompts the user for the name of a team,
and prints the data specified in the following parts for that team.

Part 1: Games Played
Implement the ability to output the number of games played by any given team.

Part 2: Wins and Losses
Extend the program so that it has the ability to print the number of wins and losses of a given team.
The winner of a game is the team that has gained more points from it.

You may assume that the games cannot be tied.
 */
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatisticsMySoltion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("File:");
        String file = sc.nextLine();

        System.out.println("Team:");
        String team = sc.nextLine();

        int gamesCount = 0;
        int winsCount = 0;
        int losesCount = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];

                int homeTeamScore = Integer.valueOf(parts[2]);
                int visitingTeamScore = Integer.valueOf(parts[3]);

                if (homeTeam.contains(team)) {
                    gamesCount++;

                    if (homeTeamScore > visitingTeamScore) {
                        winsCount++;
                    } else if (homeTeamScore < visitingTeamScore) {
                        losesCount++;
                    }
                }

                if (visitingTeam.contains(team)) {
                    gamesCount++;

                    if (homeTeamScore < visitingTeamScore) {
                        winsCount++;
                    } else if (homeTeamScore > visitingTeamScore) {
                        losesCount++;
                    }
                }
            }
            System.out.println("Games: " + gamesCount);
            System.out.println("Wins: " + winsCount);
            System.out.println("Losses: " + losesCount);

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
