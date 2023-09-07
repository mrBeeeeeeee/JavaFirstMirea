package ru.mirea.task1.opt7;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число, факториал которого нужно вычислить");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Результат: " + fact(a));
    }
    private static long fact(int a){
        long f = 1;
        for(int i = a; i > 1; i--)
            f *= i;
        return f;
    }
}
