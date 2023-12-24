package ru.mirea.task3.part1.opt1;
import java.util.Arrays;
import java.util.Random;
import java.math.*;

public class DoubleArray {
    public static void main(String[] args) {
        double[] a1 = new double[15]; // для Random.nextDouble()
        double[] a2 = new double[15]; // для Math.random()
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            a1[i] = rand.nextDouble(10);
            a2[i] = Math.random()*10;
        }

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14-i; j++) {
                if (a1[j] > a1[j+1]) {
                    double tmp = a1[j+1];
                    a1[j+1] = a1[j];
                    a1[j] = tmp;
                }
                if (a2[j] > a2[j+1]) {
                    double tmp = a2[j+1];
                    a2[j+1] = a2[j];
                    a2[j] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив a1:\n" + Arrays.toString(a1));
        System.out.println("Отсортированный массив a2:\n" + Arrays.toString(a2));
    }
}
