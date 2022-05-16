package ca.qc.bdeb.obj2022tp1mobile.data;

import java.util.List;

public class Door {
    private int temperature;
    private int distance;
    private int motorSpeed;
    private int motorDirection;
    private int maxOverture;
    private int minOverture;
    private String controlMode;
    private List<Integer> temperatureHistory;
    private List<Integer> overtureHistory;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMotorSpeed() {
        return motorSpeed;
    }

    public void setMotorSpeed(int motorSpeed) {
        this.motorSpeed = motorSpeed;
    }

    public int getMotorDirection() {
        return motorDirection;
    }

    public void setMotorDirection(int motorDirection) {
        this.motorDirection = motorDirection;
    }

    public int getMaxOverture() {
        return maxOverture;
    }

    public void setMaxOverture(int maxOverture) {
        this.maxOverture = maxOverture;
    }

    public int getMinOverture() {
        return minOverture;
    }

    public void setMinOverture(int minOverture) {
        this.minOverture = minOverture;
    }

    public String getControlMode() {
        return controlMode;
    }

    public void setControlMode(String controlMode) {
        this.controlMode = controlMode;
    }

    public List<Integer> getTemperatureHistory() {
        return temperatureHistory;
    }

    public void setTemperatureHistory(List<Integer> temperatureHistory) {
        this.temperatureHistory = temperatureHistory;
    }

    public List<Integer> getOvertureHistory() {
        return overtureHistory;
    }

    public void setOvertureHistory(List<Integer> overtureHistory) {
        this.overtureHistory = overtureHistory;
    }
}
