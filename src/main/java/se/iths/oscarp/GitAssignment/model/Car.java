package se.iths.oscarp.GitAssignment.model;

public class Car {
    private String manufactures;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String manufactures, String model, String color) {
        this.manufactures = manufactures;
        this.model = model;
        this.color = color;
    }

    public String getManufactures() {
        return manufactures;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
