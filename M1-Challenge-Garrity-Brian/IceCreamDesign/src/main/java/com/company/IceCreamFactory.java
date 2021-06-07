package com.company;

public class IceCreamFactory {
    private double priceByGallon;
    private int iceCreamByGallon;
    private int shippingCost;

    public IceCreamFactory(double priceByGallon, int iceCreamByGallon, int shippingCost) {
        this.priceByGallon = priceByGallon;
        this.iceCreamByGallon = iceCreamByGallon;
        this.shippingCost = shippingCost;


    }

    public double getPriceByGallon() {
        return priceByGallon;
    }

    public void setPriceByGallon(double priceByGallon) {
        this.priceByGallon = priceByGallon;
    }

    public int getIceCreamByGallon() {
        return iceCreamByGallon;
    }

    public void setIceCreamByGallon(int iceCreamByGallon) {
        this.iceCreamByGallon = iceCreamByGallon;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void run() {
        System.out.println("The Factory started to make ice cream!");
    }
    public void endOfDay() {
        System.out.println("The Factory is shutting down! End of Day Procedures ");
    }

    public String buyMoreMilk(int milkStorage) {
        int i = milkStorage;
        if (i == 0) {
            return "Need to resupply milk storage!";
        } else {
            return "Don't need to resupply milk. Keep Churning";
        }



    }
}
