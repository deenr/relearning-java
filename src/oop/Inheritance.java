package oop;

public class Inheritance {
    public static void main(String[] args) {
        Computer computer = new Computer("RTX 3080");
        computer.powerOn();
        computer.openMicrosoftWord();

        Monitor monitor = new Monitor("1920x1080");
        monitor.powerOn();
        monitor.changeResolution("1280x720");
    }
}

class ElectronicDevice {
    int batteryPercentage;

    void charge() {
        batteryPercentage = 100;
    }

    void powerOn() {
        System.out.println("The device is being powered on.");
    }
}

class Computer extends ElectronicDevice {
    String graphicsCard;

    Computer(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    void openMicrosoftWord() {
        System.out.println("Microsoft Word is being opened.");
    }
}

class Monitor extends ElectronicDevice {
    String resolution;

    Monitor(String resolution) {
        this.resolution = resolution;
    }

    @Override
    void powerOn() {
        System.out.println("The monitor is turned on.");
    }

    void changeResolution(String resolution) {
        this.resolution = resolution;
        System.out.println("The resulotion is set to " + this.resolution);
    }
}
