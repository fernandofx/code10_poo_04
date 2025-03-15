package com.fernandofx.rental;

public class RentalItem {
    private String itemName;
    private int itemId;
    private boolean avaiable;

    

    public RentalItem(String itemName, int itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.avaiable = true;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isAvaiable() {
        return avaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this.avaiable = avaiable;
    }
}
