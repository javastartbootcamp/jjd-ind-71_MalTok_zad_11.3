package pl.javastart.task;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private final HardDrive hardDrive;

    Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        if (processor == null || memory == null || hardDrive == null) {
            throw new NullPointerException("Component cannot be null");
        }
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "\nprocessor=" + processor +
                "\nmemory=" + memory +
                "\nhardDrive=" + hardDrive;
    }
}
