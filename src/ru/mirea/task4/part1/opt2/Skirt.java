package ru.mirea.task4.part1.opt2;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(ClothSize size, double price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressWomen() {
        System.out.println("Женщина надела юбку");
    }
}
