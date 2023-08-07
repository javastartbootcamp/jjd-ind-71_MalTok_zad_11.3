package pl.javastart.task;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            Computer computer = new Computer(
                    new Processor("i7", "Intel", 189447394,
                            2500, 60, 100),
                    new Memory("Fury Beast", "Kingston", 103820948,
                            3200, 50, 80, 16),
                    new HardDrive("2.5\" SSD SATA III", "GIGABYTE", 123023,
                            256)
            );
            computer.getProcessor().overclock(2800);
            System.out.println(computer.getProcessor());
            computer.getMemory().overclock(3500);
            System.out.println(computer.getMemory());
        } catch (IllegalComponentStateException e) {
            System.err.println("Temperatura jest za wysoka, komponent może ulec spaleniu!");
        } catch (NullPointerException e) {
            System.err.println("Komponent nie może być null");
        } catch (IllegalArgumentException e) {
            System.err.println("Wartość musi być dodatnia");
        }
    }
}
