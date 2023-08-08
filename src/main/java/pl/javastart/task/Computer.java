package pl.javastart.task;

import pl.javastart.task.component.HardDrive;
import pl.javastart.task.component.Memory;
import pl.javastart.task.component.Processor;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private final HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        if (processor == null || memory == null || hardDrive == null) {
            throw new InvalidComponentException("Component cannot be null");
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
