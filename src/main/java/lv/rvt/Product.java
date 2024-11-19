package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String location;
    private int weight;

    public Product(String name, double price, int quantity, String location) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public Product(String name, String location){
        this.name = name;
        this.location = location;
    }

    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name + ", price " + this.price + " quantity " + this.quantity + " location " + this.location + " weight " + this.weight;
    }
}
