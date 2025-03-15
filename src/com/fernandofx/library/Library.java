package com.fernandofx.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<LibraryItem> libraryItems;

    public Library(){
        this.libraryItems = new ArrayList<>();
    }

    public void add(LibraryItem library) {
        this.libraryItems.add(library);

    }

    public LibraryItem getItem(int index){
        return this.libraryItems.get(index);
    }

    public void showAllItems(){

        for( LibraryItem l: this.libraryItems){
            System.out.println("====================================");
           l.showDetail();
           //System.out.print(  l.isLoaned() ? "It is loaned" : "It isn't loaned" );


        }
    }

}
