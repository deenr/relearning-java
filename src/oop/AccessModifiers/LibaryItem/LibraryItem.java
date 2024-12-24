package oop.AccessModifiers.LibaryItem;

public class LibraryItem {
    protected String title;
    protected boolean isOverdue;

    public LibraryItem(String title, boolean isOverdue) {
        this.title = title;
        this.isOverdue = isOverdue;
    }

    protected double calculateFine() {
        return isOverdue ? 10.0 : 0.0; 
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Fine: $" + calculateFine());
    }
}
