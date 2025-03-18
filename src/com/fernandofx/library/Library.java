package com.fernandofx.library;

import java.util.ArrayList;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<LibraryUser> users;

    public Library() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LibraryItem> items) {
        this.items = items;
    }

    public ArrayList<LibraryUser> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<LibraryUser> users) {
        this.users = users;
    }

    public void addItem(LibraryItem itemAdd) {
        boolean isFound = false;
        for(LibraryItem item: items) {
            if(itemAdd.getItemId() == item.getItemId()) {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("Item already exists");
            return;
        }
        items.add(itemAdd);
        System.out.println("Item added");

    }
    // crear el metodo para agregar un usuario
    // el username y el userId deben de ser unicos (no se pueden repetir)
    public void addUser(LibraryUser userAdd) {
        boolean isFound = false;
        for(LibraryUser user: users) {
            if(user.getUserId() == userAdd.getUserId()) {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("User already exists");
            return;
        }
        users.add(userAdd);
        System.out.println("User added");
    }

    public void loanItem(int idUser, int idItem) {
        // buscando al usuario
        LibraryUser userFound = null;
        for(LibraryUser user: users) {
            if(idUser == user.getUserId()) {
                userFound = user;
                break;
            }
        }
        if(userFound == null) {
            System.out.println("User not found");
            return;
        }

        // buscando al item
        LibraryItem itemFound = null;
        for(LibraryItem item: items) {
            if(idItem == item.getItemId()) {
                itemFound = item;
                break;
            }
        }
        if(itemFound == null || itemFound.getIsLoaned()) {
            System.out.println("Item not found or is loaned");
            return;
        }

        // operacion de prestamo
        userFound.getLoanedItems().add(itemFound);
        itemFound.setIsLoaned(true);
        System.out.println("Item loaned");
    }
}