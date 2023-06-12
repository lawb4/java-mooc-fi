package Fundamentals_II.Part_9.ClassInheritance.Warehousing;

import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        //return Collections.max(this.history);

        if (history.isEmpty()) {
            return 0;
        }

        double max = history.get(0);
        for (Double elem : history) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public double minValue() {
        //return Collections.min(this.history);

        if (history.isEmpty()) {
            return 0;
        }

        double min = history.get(0);
        for (Double elem : history) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Double elem : history) {
            sum += elem;
        }
        return sum / history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
