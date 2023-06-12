package Fundamentals_II.Part_11.Packages.SensorsAndTemperature.application;

public class StandardSensor implements Sensor{

    private int function;
    //private boolean state;

    public StandardSensor(int function) {
        this.function = function;
        //this.state = false;
    }

    @Override
    public boolean isOn() {
        //return this.state = true;
        return true;
    }

    @Override
    public void setOn() {
        //state = true;
    }

    @Override
    public void setOff() {
        //state = false;
    }

    @Override
    public int read() {
        return this.function;
    }
}
