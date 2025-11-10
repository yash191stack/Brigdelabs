package com.bridgelabz.oops.levelone;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 101;
        item.itemName = "Wireless Mouse";
        item.price = 550.0;

        item.displayItemDetails();
        int quantity = 3;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}
