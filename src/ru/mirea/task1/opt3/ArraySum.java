package ru.mirea.task1.opt3;
import java.util.Scanner;

public class ArraySum {
        public static void main(String[] args) {
            System.out.println("Введите кол-во элементов массива!");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Среднее арифметическое элементов: " + (float)sum/n);

        }
}
