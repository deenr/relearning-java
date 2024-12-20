package oop;

public class SuperKeyword {
    public static void main(String[] args) {
        Phone phone = new Phone(50, "Mobile Vikings");
        phone.charge();
        
        Laptop laptop = new Laptop(20, "RTX 2060");
        laptop.charge();
    }
}

class ElectronicsDevice {
    int battery;

    ElectronicsDevice(int battery) {
        this.battery = battery;
    }

    void charge() {
        battery = 100;
        System.out.println("Battery is fully charged.");
    }
} 

class Phone extends ElectronicsDevice {
    String mobileProvider;

    Phone(int battery, String mobileProvider) {
        super(battery);

        this.mobileProvider = mobileProvider;
    }

    void charge() {
        super.charge();
        System.out.printf("Charging the phone to %d%% is not so good for a phone.\n", super.battery);
    }
}

class Laptop extends ElectronicsDevice {
    String graphicsCard;

    Laptop(int battery, String graphicsCard) {
        super(battery);

        this.graphicsCard = graphicsCard;
    }
}
