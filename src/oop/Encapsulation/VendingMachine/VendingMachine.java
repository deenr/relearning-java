package oop.Encapsulation.VendingMachine;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<VendingMachineItem> items = new ArrayList<VendingMachineItem>();

    public void addItem(String code, String name, int amount) {
        VendingMachineItem item = new VendingMachineItem(code, name, amount);
        items.add(item);

    }

    public void takeItem(String code) {
        VendingMachineItem item = findItemByCode(code);
        item.takeItem();
    }

    public void refill(String code, int amount) {
        VendingMachineItem item = findItemByCode(code);
        item.refill(amount);
    }
    
    private VendingMachineItem findItemByCode(String code) {
        for (VendingMachineItem item : items) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }
}

class VendingMachineItem {
    private String code;
    private int amount;
    private String name;

    VendingMachineItem(String code, String name, int amount) {
        this.code = code;
        this.name = name;
        this.amount = amount;
    }

    String getCode() {
        return this.code;
    }

    void takeItem() {
        if (amount > 0) {
            amount--;
            System.out.println("Enjoy your " + name + ".");
        } else {
            System.out.println("There is no " + name + " left. Please select something else");
        }
    }

    void refill(int amount) {
        if (amount > 0) {
            this.amount += amount;
            System.out.println("Refilled " + name + ". There are now " + this.amount + ".");
        } else {
            System.out.println("Invalid refill amount.");
        }
    }
}
