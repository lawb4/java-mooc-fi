package Fundamentals_II.Part_11.Packages.SensorsAndTemperature.application;

public interface Sensor {

    boolean isOn();
    void setOn();
    void setOff();
    int read();
}
