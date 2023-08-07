package pl.javastart.task;

class Memory extends OverclockableComponent {
    private static final int MEMORY_TEMPERATURE_INCREASE_PER_100_MHZ = 15;
    private final int amount;

    Memory(String model, String producer, int serialNumber,
                  int clockSpeed, double temperature, double maxTemperature, int amount) {
        super(model, producer, serialNumber, clockSpeed, temperature, maxTemperature);
        if (amount < 0) {
            throw new IllegalArgumentException("Must be positive value");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    double temperatureIncrease(int desiredClockSpeed) {
        return (desiredClockSpeed - clockSpeed) / 100. * MEMORY_TEMPERATURE_INCREASE_PER_100_MHZ;
    }

    @Override
    public String toString() {
        return "Memory " + super.toString();
    }
}
