package ua.edu.ucu.apps.lab71.flowers;

public class Item {
    private Flower flower;
    private float price;

    public Item(Flower flower, float price) {
        this.flower = flower;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public Flower getFlower() {
        return flower;
    }
}
