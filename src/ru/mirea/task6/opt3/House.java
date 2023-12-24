package ru.mirea.task6.opt3;

public class House implements Nameable{
    private String name;

    public House(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
