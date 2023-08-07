package pl.javastart.task;

class Processor extends OverclockableComponent {
    private static final int PROCESSOR_TEMPERATURE_INCREASE_PER_100_MHZ = 10;

    Processor(String model, String producer, int serialNumber,
                     int clockSpeed, double temperature, double maxTemperature) {
        super(model, producer, serialNumber, clockSpeed, temperature, maxTemperature);
    }

    @Override
    double temperatureIncrease(int desiredClockSpeed) {
        return (desiredClockSpeed - clockSpeed) / 100. * PROCESSOR_TEMPERATURE_INCREASE_PER_100_MHZ;
    }

    @Override
    public String toString() {
        return "Processor " + super.toString();
    }
}
