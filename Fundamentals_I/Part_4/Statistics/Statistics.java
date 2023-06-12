package Fundamentals_I.Part_4.Statistics;

public class Statistics {
    private int count;
    private int sum;
    private double average;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
        //return this.sum
    }

    public double average() {
        double average = (double) this.sum / this.count;

        if (this.count == 0) {
            return 0;
        }
        return average;
    }
}
