package ru.mirea.task6.opt4;

public class Smartphone implements Priceable{
    private double price;

    Smartphone(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
