package ru.mirea.task4.part1.opt2;

public class Tie extends Clothes implements MenClothing{
    public Tie(ClothSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галстук");
    }
}
