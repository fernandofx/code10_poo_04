package com.fernandofx.library;

public class Book extends LibraryItem{

    private String author;


    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showDetail(){
        System.out.println("Title: " + this.getTitle());
        System.out.println("ID: " + this.getItemId());
        System.out.println("Is Loaned?: " + this.isLoaned());
        System.out.println("Author: " + this.author);
    }
}
