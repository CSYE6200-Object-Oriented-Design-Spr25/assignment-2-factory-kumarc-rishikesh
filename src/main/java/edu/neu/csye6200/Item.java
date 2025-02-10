package edu.neu.csye6200;

public class Item {

    public int id;
    public String name;
    public double price;

    public Item() {
    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item class";
    }
}
