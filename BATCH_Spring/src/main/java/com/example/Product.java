package com.example;

import java.time.LocalDate;

public class Product {

    private int id;
    private String name;
    private double price;
    private LocalDate mfgDt;

    public Product() {
    }

    public Product(
            int id,
            String name,
            double price,
            LocalDate mfgDt) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.mfgDt = mfgDt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getMfgDt() {
        return mfgDt;
    }

    public void setMfgDt(LocalDate mfgDt) {
        this.mfgDt = mfgDt;
    }

    @Override
    public String toString() {
        return "Product [id=" + id
                + ", name=" + name
                + ", price=" + price
                + ", mfgDt=" + mfgDt
                + "]";
    }
}