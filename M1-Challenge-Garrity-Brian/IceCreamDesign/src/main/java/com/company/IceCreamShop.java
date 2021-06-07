package com.company;


import java.util.Objects;

public class IceCreamShop {

    private String flavor;
    private String description;
    private double price;

    public IceCreamShop(String flavor, String description, double price) {
        this.flavor = flavor;
        this.description = description;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getSpecial() {
        System.out.println("Special of the day is Black Raspberry for $3.50 per scoop");
    }

    public void staffRecommendation() {
        System.out.println("The staff would recommend you to try the Chocolate Chip Cookie Dough!");
    }

    public void birthdayDiscount() {
        System.out.println("If its your birthday you get a free scoop of ice cream!!");
    }

    public String restockIceCream(int iceCreamStorage) {
        int i = iceCreamStorage;
        if (i == 0) {
            return "Time to Restock this flavor!";
        } else {
            return "Don't need to restock ice cream yet!";
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamShop that = (IceCreamShop) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(flavor, that.flavor) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, description, price);
    }

}


