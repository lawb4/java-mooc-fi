package Fundamentals_I.Part_7.LargerProgrammingExercises.RecipeSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // You could eliminate the CookBook class and put the
        // ui class here

        Scanner sc = new Scanner(System.in);
        //CookBook cookBook = new CookBook();
        ArrayList<Recipe> recipes = new ArrayList<>();

        UserInterface ui = new UserInterface(sc, recipes);
        ui.run();

        //Scanner sc = new Scanner(System.in);
        //Recipe recipes = new Recipe(String name, int cookingTime);

        /*System.out.print("File to read: ");
        String fileName = sc.nextLine();
        //System.out.println();
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        while (true) {
            System.out.print("Enter command: ");
            String command = sc.nextLine();

            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
        }
    }

    public void printRecipe(String fileName) {
        ArrayList<Recipe> ingredients = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());

                /*while (fileReader.hasNext()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }

                }

                recipes.add(new Recipe(name, cookingTime));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            //System.out.println("Reading the file " + fileName + " failed.");
        }*/
    }

}
