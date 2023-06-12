package Fundamentals_I.Part_7.LargerProgrammingExercises.BigYear;

import java.util.ArrayList;

/***/ // This means I looked it up after getting the solution at MOOCFi

public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird chooseBird) {
        this.birds.add(chooseBird);
        //chooseBird.observation();

    }

    /***/
    /*public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));


    }*/
    /***/

    public void observation(String chooseBird) {
        for (Bird bird : birds) {
            if (chooseBird.equals(bird.getName())) {
                bird.observation();
            }
        }
    }

    public boolean containsName(String searchedName) {
        for (Bird bird : birds) {
            if (searchedName.equals(bird.getName())) {
                return true;
            }
        }
        return false;
    }

    /***/ // Instead of observation() and containsName()

    /*public boolean observation(String searchedName) {
        for (Bird bird : birds) {
            if (bird.getName().equals(searchedName)) {
                bird.observation();
                return true;
            }
        }

        return false;
    }*/

    /***/

    public ArrayList<Bird> all() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
        return birds;   // return to the UserInterface and sout toString of Bird bird
    }

    /***/
    // I don't really get it why you need to implement this
    // method if you could pass with the \\public ArrayList<Bird> all() one\\

    /*public String getAll() {
        String allBirds = "";
        for (Bird bird : birds) {
            allBirds += bird.toString();
        }

        return allBirds;
    }*/

    /***/

    /*public void one(Bird chooseBird) {
        for (Bird bird : birds) {
            if (birds.contains(chooseBird)) {
                System.out.println(bird);
                break;
            }
        }
    }*/

    public void one(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {
                System.out.println(bird);
            }
        }
    }

    /***/

    /*public String getOne(String name) {
        for (Bird bird : birds) {
            if (bird.name().equals(name)) {
                return bird.toString();
            }
        }

        return null;
    }*/

    /***/

   /* public String getBirdsName(String name) {
        String searchedName = null;

        for (Bird bird : birds) {
            searchedName = bird.getName();

            if (name.equals(searchedName)) {
                //return searchedName;
                //one(bird);
                System.out.println(bird);
            }
        }
        return "Bird not found";
    }*/
}
