package ru.mirea.task6.opt3;

public class Test {
    public static void main(String[] args) {
        Planet planet = new Planet("Венера");
        Animal animal = new Animal("Собака");
        House house = new House("Многоэтажка");

        System.out.println(planet.getName());
        System.out.println(animal.getName());
        System.out.println(house.getName());
    }
}
