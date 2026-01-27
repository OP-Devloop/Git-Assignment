package se.iths.oscarp.GitAssignment.model;

public class ClothingStore {
    private final int id;
    private final String clothing;
    private final double price;

    public ClothingStore(int id, String clothing, double price) {
        this.id = id;
        this.clothing = clothing;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getClothing() {
        return clothing;
    }

    public double getPrice() {
        return price;
    }
}
