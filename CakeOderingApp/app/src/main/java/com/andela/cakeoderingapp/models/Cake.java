package com.andela.cakeoderingapp.models;


public class Cake extends Model {

    private String category;
    private String snapshot;
    private String price;

    public Cake() {

    }

    public Cake(String id) {
        super(id);
    }

    public Cake(String id, String name) {
        super(id, name);
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
