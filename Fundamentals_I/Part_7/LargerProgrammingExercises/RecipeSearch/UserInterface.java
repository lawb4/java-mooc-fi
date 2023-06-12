package Fundamentals_I.Part_7.LargerProgrammingExercises.RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner sc;
    private ArrayList<Recipe> recipes;
    //private CookBook cookBook;

    /*public UserInterface(Scanner sc, CookBook cookBook) {
        this.sc = sc;
        this.cookBook = cookBook;
    }*/

    public UserInterface(Scanner sc, ArrayList<Recipe> recipes) {
        this.sc = sc;
        this.recipes = new ArrayList<>();
    }

    public void run() {
        System.out.print("File to read: ");
        String fileName = sc.nextLine();
        readFile(fileName);

        System.out.println();
        System.out.println("Commands:");
        System.out.println("1 - lists the recipes");
        System.out.println("2 - stops the program");
        System.out.println("3 - searches recipes by name");
        System.out.println("4 - searches recipes by cooking time");
        System.out.println("5 - searches recipes by ingredient");
        System.out.println();

        while (true) {
            System.out.print("Enter command: ");
            String command = sc.nextLine();

            processCommand(command);

            if (command.equals("stop")) {
                // lists all the ingredients
                /* (Recipe recipe : cookBook.getRecipes()){
                    System.out.println(recipe.getIngredients());
                }*/
                break;
            }
        }
    }

    public void processCommand(String command) {
        if (command.equals("list")) {
            System.out.println("Recipes:");
            for (Recipe recipe : recipes /*cookBook.getRecipes()*/) {
                System.out.println(recipe);
            }
            System.out.println();
        }

        if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String name = sc.nextLine();
            System.out.println();

            System.out.println("Recipes:");
            for (Recipe recipe : recipes /*cookBook.getRecipes()*/) {
                String searchedName = recipe.getName();

                if (searchedName.contains(name)) {
                    System.out.println(recipe);
                }
            }
            System.out.println();
        }

        if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int time = Integer.valueOf(sc.nextLine());
            System.out.println();

            System.out.println("Recipes:");
            for (Recipe recipe : recipes /*cookBook.getRecipes()*/) {
                int searchedTime = recipe.getCookingTime();

                if (searchedTime <= time) {
                    System.out.println(recipe);
                }
            }
            System.out.println();
        }

        if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = sc.nextLine();
            System.out.println();

            System.out.println("Recipes:");
            for (Recipe recipe : recipes /*cookBook.getRecipes()*/) {
                if (recipe.containsIngredient(ingredient)) {
                    System.out.println(recipe);
                }
            }
            System.out.println();
        }
    }

    public void readFile(String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            // read recipes and ingredients
            while (fileReader.hasNextLine()) {

                // read a recipe and create an object to represent it
                String name = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);

                // add recipe to the list
                /////cookBook.addRecipe(recipe);
                recipes.add(recipe);

                // add ingredients for the recipe
                while (fileReader.hasNext()) {
                    String ingredient = fileReader.nextLine();

                    // ingredients end with an empty line
                    if (ingredient.isEmpty()) {
                        // exit from this while loop
                        // (the outer loop is not exited)
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            //System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}
