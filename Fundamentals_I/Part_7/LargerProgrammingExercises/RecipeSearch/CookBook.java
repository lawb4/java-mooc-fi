package Fundamentals_I.Part_7.LargerProgrammingExercises.RecipeSearch;

import java.util.ArrayList;

public class CookBook {
    private ArrayList<Recipe> recipes;

    public CookBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        return "" + recipes.size();
    }
}
