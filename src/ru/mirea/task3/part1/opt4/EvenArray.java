package ru.mirea.task3.part1.opt4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите длину массива");
        int n = sc.nextInt();

        while (n <= 0){
            System.out.println("Введите корректное число!");
            n = sc.nextInt();
        }
        int[] a = new int[n];
        int k = 0; // счетчик четных элементов
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(n+1);
            if (a[i] % 2 == 0)
                k++;
        }
        System.out.println("Массив: " + Arrays.toString(a));

        if(k > 0) {
            int[] evena = new int[k];
            k = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    evena[k] = a[i];
                    k++;
                }
            }
            System.out.println("Массив четных элементов: " + Arrays.toString(evena));
        }
        else{
            System.out.println("Нет четных элементов!");
        }

    }
}
