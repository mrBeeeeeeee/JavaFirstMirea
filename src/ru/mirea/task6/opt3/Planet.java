package ru.mirea.task6.opt3;

public class Planet implements Nameable{
    private String name;
    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
