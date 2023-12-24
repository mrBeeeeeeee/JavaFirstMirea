package ru.mirea.task8.opt2;

public class Main {
    public static void main(String[] args) {
        recur_func(5);
    }
    static void recur_func(int n){
        if ( n > 0) {
            recur_func(n - 1);
            System.out.print(n + " ");
        }
    }
}
