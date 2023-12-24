package ru.mirea.task4.part1.opt2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(ClothSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела футболку");
    }
}
