package com.muaadh_melhi_nycdeveloper.advancerecycleview;

/**
 * Created by rapier pc on 1/1/2018.
 */

class Restaurant {
    private int id;
    private String name;
    private String description;
    private double price;
    private String thumbnail;
    //

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }


    //

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
