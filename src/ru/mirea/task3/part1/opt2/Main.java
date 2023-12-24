package ru.mirea.task3.part1.opt2;
import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Tester tester = new Tester();

        System.out.println("Введите кол-во окружностей в массиве: ");
        int n = sc.nextInt();

        tester.generateCircles(n); // заполнение массива окружностей длинной n случаным образом
        System.out.println(tester.toString());

        System.out.println("Самая маленькая окружность: " + tester.minCircle().toString());
        System.out.println("Самая большая окружность: " + tester.maxCircle().toString());

        System.out.println("Отсортированный массив (по радиусу): ");
        tester.sort();
        System.out.println(tester.toString());




    }
}
