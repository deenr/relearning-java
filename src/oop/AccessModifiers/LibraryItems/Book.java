package oop.AccessModifiers.LibraryItems;

import oop.AccessModifiers.LibaryItem.LibraryItem;

public class Book extends LibraryItem {
    private int daysOverdue;

    public Book(String title, boolean isOverdue, int daysOverdue) {
        super(title, isOverdue);
        this.daysOverdue = daysOverdue;
    }

    @Override
    protected double calculateFine() {
        return isOverdue ? daysOverdue * 0.5 : 0.0;
    }
}

