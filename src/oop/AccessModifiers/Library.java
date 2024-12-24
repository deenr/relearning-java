package oop.AccessModifiers;

import oop.AccessModifiers.LibaryItem.LibraryItem;
import oop.AccessModifiers.LibraryItems.Book;
import oop.AccessModifiers.LibraryItems.DVD;

public class Library {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming", true, 5);
        LibraryItem dvd = new DVD("Inception", true);

        book.displayDetails(); // Output: Fine logic from Book class
        // book.calculateFine(); // The calculate fine can not be called because it is a protected function 
        
        dvd.displayDetails();  // Output: Fine logic from DVD class
    }
}
