package com.thoughtworks.codepairing.model;

public class Gift {
    private GiftType type;
    private String item;
    private double priceInRupees;

    public Gift(GiftType type, String item, double priceInRupees) {
        this.type = type;
        this.item = item;
        this.priceInRupees = priceInRupees;
    }

    public String getItem() {
        return item;
    }

    public double getPriceInRupees() {
        return priceInRupees;
    }

    public GiftType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "main.java.model.Gift{" +
                "type=" + type +
                ", item='" + item + '\'' +
                ", price=" + priceInRupees +
                '}';
    }
}
