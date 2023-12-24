package ru.mirea.task8.opt3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = scan.nextInt();
        System.out.println("Введите B: ");
        int b = scan.nextInt();

        recur_func(a, b);

    }
    static void recur_func(int a, int b){
        if (a < b){
            recur_func(a, b - 1);
        }
        else if (a > b){
            recur_func(a, b + 1);
        }
        System.out.print(b + " ");
    }
}
