package ru.mirea.task2.opt2;
import java.lang.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        System.out.println("Экземпляр класса с неизмененными координатами: " + ball1.toString());
        Ball ball2 = new Ball(1.0, 2.0);
        System.out.println("Экземпляр класса с заданными начальными координатами: " + ball2.toString());
        double x, y;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите новую координату x для ball1");
        x = scn.nextDouble();
        ball1.setX(x);
        System.out.println("Введите новую координату y для ball1");
        y = scn.nextDouble();
        ball1.setY(y);
        System.out.println("Экземпляр класса (ball1) с измененными координатами " + ball1.toString());

        System.out.println("Введите новые координаты (x y через пробел) ");
        x = scn.nextDouble();
        y = scn.nextDouble();
        ball2.setXY(x, y);
        System.out.println("Экземпляр класса (ball2) с измененными координатами " + ball2.toString());

        System.out.println("Введите координаты в качетсве расстояния для функции move (x y через пробел) ");
        x = scn.nextDouble();
        y = scn.nextDouble();

        ball2.move(x, y);
        System.out.println("Мяч ball2 передвинулся на x=" + x + " y=" + y + "\n" + ball2.toString() );
    }
}
