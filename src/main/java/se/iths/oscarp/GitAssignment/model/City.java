package se.iths.oscarp.GitAssignment.model;

public class City {
    private String location;
    private String name;

    public City() {
    }

    public City(String location, String name) {
        this.location = location;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
