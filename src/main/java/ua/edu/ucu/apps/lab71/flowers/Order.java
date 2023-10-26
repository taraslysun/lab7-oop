package ua.edu.ucu.apps.lab71.flowers;



public class Order {
    private Item[] items;
    private int quantity;

    public Order(Item[] items, int quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public int getQuantity() {
        return quantity;
    }
}
