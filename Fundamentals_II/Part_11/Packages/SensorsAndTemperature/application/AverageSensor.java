package Fundamentals_II.Part_11.Packages.SensorsAndTemperature.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
   //private boolean state;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
        //this.state = false;
    }

    @Override
    public boolean isOn() {
        //return this.state;

        for (Sensor s : sensors) {
            if (s.isOn()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setOn() {
        /*sensors.stream()
                .forEach(sensor -> sensor.setOn());
        this.state = true;*/

        for (Sensor s : sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        /*sensors.stream()
                .forEach(sensor -> sensor.setOff());
        this.state = false;*/

        for (Sensor s : sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        /*double average = 0;

        if (sensors.isEmpty() || isOn()) {
            throw new IllegalStateException();
        }

        if (isOn()) {
            average = sensors.stream()
                    .mapToInt(sensor -> sensor.read())
                    .average()
                    .getAsDouble();
        }

        this.readings.add((int) average);
        return (int) average;*/

        if (!isOn() || sensors.size() == 0) {
            throw new IllegalStateException();
        }

        int total = 0;

        for (Sensor s : sensors) {
            total += s.read();
        }

        int average = total / sensors.size();
        readings.add(average);

        return average;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        System.out.print("readings: ");
        return this.readings;
    }
}
