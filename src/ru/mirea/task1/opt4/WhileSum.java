package ru.mirea.task1.opt4;

import java.util.Scanner;

public class WhileSum {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int k = 0; // счетчик
        int max = 0;
        int min = 0;

        while (k < n){
            a[k] = sc.nextInt();
            if (k == 0){
                max = a[k];
                min = a[k];
            }
            else{
                if (a[k] > max)
                    max = a[k];
                if (a[k] < min)
                    min = a[k];
            }
            sum += a[k];
            k += 1;
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный и минимальный элементы: " + max + " 5" + min);

    }
}
