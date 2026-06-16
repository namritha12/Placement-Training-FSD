package com.example.coffeeOrder;

public class CoffeeOrder {

    private static int counter = 1;
    private int id;
    private String customerName;
    private String coffeeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public static int getNextId() {
        return counter++;
    }
}