package com.fernandofx.library;

public class Dvd extends LibraryItem{

    private String director;
    private int duration;

    public Dvd(String title, int itemId, String director, int duracion) {
        super(title, itemId);
        this.director = director;
        this.duration = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void showDetail(){

        System.out.println("Title: " + this.getTitle());
        System.out.println("ID: " + this.getItemId());
        System.out.println("Is Loaned?: " + this.isLoaned());
        System.out.println("Director: " + this.director);
        System.out.println("Duración: " + this.duration);

    }
}
