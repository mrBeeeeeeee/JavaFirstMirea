package ru.mirea.task4.part1.opt2;

public abstract class Clothes {
    private ClothSize size;
    private double cost;
    private String color;

    public Clothes(ClothSize size, double cost, String color){
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothSize getSize() {
        return size;
    }

    public void setSize(ClothSize size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
