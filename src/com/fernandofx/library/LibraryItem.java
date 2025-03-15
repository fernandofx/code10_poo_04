package com.fernandofx.library;

public class LibraryItem {

    private String title;
    private int itemId;
    private boolean isLoaned;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public void showDetail(){
        System.out.println("Title: " + title);
        System.out.println("ID: " + itemId);
        System.out.println("isLoaned: " + isLoaned);
    }
}
