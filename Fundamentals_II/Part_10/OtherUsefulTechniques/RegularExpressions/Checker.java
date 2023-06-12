package Fundamentals_II.Part_10.OtherUsefulTechniques.RegularExpressions;

public class Checker {

    public boolean isDayOfWeek (String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }

    public boolean allVowels(String string){
        if (string.matches("[aeiou]+")){
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }

    public boolean timeOfDay(String string){
        if (string.matches("(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])")){
                                // 2 mandatory + 0123 (OR) 0 or 1 + 0123456789 for hours __:__
                                // 012345 + 0123456789 for minutes __:__
                                // 012345 + 0123456789 for seconds __:__
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }
}
