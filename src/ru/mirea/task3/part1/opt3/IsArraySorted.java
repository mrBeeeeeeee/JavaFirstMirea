package ru.mirea.task3.part1.opt3;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
public class IsArraySorted {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[4];
        boolean k = true;

        for (int i = 0; i < 4; i++) {
            a[i] = rand.nextInt(10,100);
        }
        System.out.println("Массив: " + Arrays.toString(a));

        for (int i = 0; i < 3; i++) {
            if(a[i] >= a[i+1]) {
                System.out.println("Массив не упорядочен строго по возрастанию!");
                k = false;
                break;
            }
        }
        if (k){
            System.out.println("Массив упорядочен строго по возрастанию!");
        }


    }
}
