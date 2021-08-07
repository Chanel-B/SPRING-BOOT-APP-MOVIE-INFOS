package com.chanel.moviecategoryservice.model;

public class CatalogItem {

    private String name;
    private String descriptions;
    private int ratings;

    public CatalogItem(String name, String descriptions, int ratings) {
        this.name = name;
        this.descriptions = descriptions;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
