package com.fernandofx.library;

public class Dvd extends LibraryItem{
    private String director;
    private int duration;
    public Dvd(String title, int itemId, boolean isLoaned, String director, int duration) {
        super(title, itemId, isLoaned);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);
    }


}