package com.fernandofx.library;

public class Book extends LibraryItem{
    private String author;
    public Book(String title, int itemId, boolean isLoaned, String author) {
        super(title, itemId, isLoaned);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Author: " + author);
    }
}