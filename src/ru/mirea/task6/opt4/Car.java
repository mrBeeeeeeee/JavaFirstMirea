package ru.mirea.task6.opt4;

public class Car implements Priceable{
    private double price;

    Car(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
