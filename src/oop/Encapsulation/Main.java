package oop.Encapsulation;

import oop.Encapsulation.VendingMachine.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        String codeA = "AA";
        machine.addItem(codeA, "Coca cola", 10);

        String codeB = "AB";
        machine.addItem(codeB, "Fanta", 1);

        String codeC = "AC";
        machine.addItem(codeC, "Sprite", 10);

        machine.takeItem(codeA);
        machine.takeItem(codeB);
        machine.takeItem(codeC);

        machine.takeItem(codeB);
        machine.refill(codeB, 20);
        machine.takeItem(codeB);
    }
}
