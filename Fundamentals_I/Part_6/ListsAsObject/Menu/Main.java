package Fundamentals_I.Part_6.ListsAsObject.Menu;

public class Main {
    public static void main(String[] args) {
        Menu corpusA = new Menu();
        corpusA.addMeal("Smoked salmon, white wine and butter sauce with basil");
        corpusA.addMeal("Seasonal green salad with apple-honey vinaigrette");
        corpusA.addMeal("Roasted lamb in a red wine sauce");
        corpusA.addMeal("Roasted lamb in a red wine sauce");

        corpusA.printMeals();
        System.out.println();

        corpusA.clearMenu();
        corpusA.addMeal("Tomato and mozzarella salad");
        corpusA.printMeals();
    }
}
