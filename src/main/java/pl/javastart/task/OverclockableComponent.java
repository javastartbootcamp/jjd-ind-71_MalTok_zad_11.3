package pl.javastart.task;

import java.awt.*;

abstract class OverclockableComponent extends Component {
    int clockSpeed;
    double temperature;
    final double maxTemperature;

    OverclockableComponent(String model, String producer, int serialNumber,
                           int clockSpeed, double temperature, double maxTemperature) {
        super(model, producer, serialNumber);
        if (clockSpeed < 0 || temperature < 0 || maxTemperature < 0) {
            throw new IllegalArgumentException("Must be positive value");
        }
        this.clockSpeed = clockSpeed;
        this.temperature = temperature;
        this.maxTemperature = maxTemperature;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    void overclock(int desiredClockSpeed) {
        double temperatureIncrease = temperatureIncrease(desiredClockSpeed);
        if (temperature + temperatureIncrease > maxTemperature) {
            throw new IllegalComponentStateException("Temperature is too high");
        } else {
            temperature = temperature + temperatureIncrease;
            clockSpeed = desiredClockSpeed;
        }
    }

    abstract double temperatureIncrease(int desiredClockSpeed);

    @Override
    public String toString() {
        return super.toString() + ", clockSpeed=" + clockSpeed +
                " MHz, temperature=" + temperature +
                " C, maxTemperature=" + maxTemperature + " C";
    }
}
