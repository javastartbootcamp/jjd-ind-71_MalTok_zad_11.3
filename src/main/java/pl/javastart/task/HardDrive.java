package pl.javastart.task;

class HardDrive extends Component {
    private final int capacity;

    HardDrive(String model, String producer, int serialNumber, int capacity) {
        super(model, producer, serialNumber);
        if (capacity < 0) {
            throw new IllegalArgumentException("Must be positive value");
        }
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "HardDrive " + super.toString() +
                "capacity=" + capacity + " GB";
    }
}
