package ru.mirea.task7.opt4;

public class Test {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double circleLength = 2 * mathFunc.getPI() * 6; // Вычисление длины окружности с радиусом 6

        System.out.println("Длина окружности: " + circleLength);

    }
}
