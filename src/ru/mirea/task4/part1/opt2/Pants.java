package ru.mirea.task4.part1.opt2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(ClothSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела штаны");
    }
}
