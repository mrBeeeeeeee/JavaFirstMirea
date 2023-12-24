package ru.mirea.task4.part1.opt3;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println('\t'+ name + " $" + price);

    }
}
