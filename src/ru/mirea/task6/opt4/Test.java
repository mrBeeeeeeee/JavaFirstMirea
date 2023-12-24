package ru.mirea.task6.opt4;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(150);
        Smartphone smartphone = new Smartphone(20);

        System.out.println(car.getPrice());
        System.out.println(smartphone.getPrice());
    }
}
