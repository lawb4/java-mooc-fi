package Fundamentals_II.Part_11.Packages.SensorsAndTemperature.application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void setOn() {
        state = true;
    }

    @Override
    public void setOff() {
        state = false;
    }

    @Override
    public int read() {
        if (isOn()) {
            return randomGenerate(-30, 30);
            //Random newRandom = new Random();
            //return random.nextInt(61) - 30;
        }
        throw new IllegalArgumentException();
    }

    public int randomGenerate(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
