package Fundamentals_I.Part_5.LearningOOP.Cube;

public class Cube {
    private int length;

    public Cube (int edgeLength){
        this.length = edgeLength;
    }

    public int volume(){
        return length * length * length;
    }

    @Override
    public String toString(){
        return "The length of the edge is " + this.length + " and the volume " + this.volume();
    }
}
