package pl.javastart.task.component;

abstract class Component {
    private final String model;
    private final String producer;
    private final int serialNumber;

    Component(String model, String producer, int serialNumber) {
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    String getModel() {
        return model;
    }

    String getProducer() {
        return producer;
    }

    int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber=" + serialNumber;
    }
}
