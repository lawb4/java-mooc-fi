package Fundamentals_I.Part_4.___ObjectsInAList.TelevisionPrograms;

public class TelevisionProgram {
    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef"); // if true
    }

    public String getName() {
        return this.name;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
