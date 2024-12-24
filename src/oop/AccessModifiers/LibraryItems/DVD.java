package oop.AccessModifiers.LibraryItems;

import oop.AccessModifiers.LibaryItem.LibraryItem;

public class DVD extends LibraryItem {
    public DVD(String title, boolean isOverdue) {
        super(title, isOverdue);
    }

    @Override
    protected double calculateFine() {
        return isOverdue ? 15.0 : 0.0; // Fixed fine for DVDs
    }
}
