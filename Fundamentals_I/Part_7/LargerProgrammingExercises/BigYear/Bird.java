package Fundamentals_I.Part_7.LargerProgrammingExercises.BigYear;

public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    /*public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }*/

    public void observation() {
        this.observation++;

    }


    @Override
    public String toString() {
        String observationRemark = "observations";
        if (observation == 1) {
            observationRemark = "observation";
        }

        return name + " (" + latinName + "): " + observation + " " + observationRemark;
    }
}
