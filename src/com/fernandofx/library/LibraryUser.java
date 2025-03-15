package com.fernandofx.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {

    private String userName;
    private int userId;
    private final List<LibraryItem> loanedItems;

    public LibraryUser(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
        this.loanedItems = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<LibraryItem> getLoanedItems() {
        return loanedItems;
    }

    public void setLoanedItems(LibraryItem libraryItem) {
        this.loanedItems.add(libraryItem);
    }


    public void showDetail(){
        System.out.println("User Name: " + this.userName);
        System.out.println("User ID: " + this.userId);
        if(!this.loanedItems.isEmpty()){
            this.loanedItems.forEach(c -> System.out.println("Loaned: " + c.getTitle()) );
        }else{
            System.out.println("Loaned: is Empty");
        }


    }
}
