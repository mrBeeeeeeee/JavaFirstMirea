package ru.mirea.task4.part1.opt1;

public class Program {
    public static void main(String[] args) {
        Season fav_season = Season.SPRING;
        System.out.println("Мое любимое время года: " +
                fav_season.name() +
                '\n' +
                fav_season.toString());
        System.out.println("\nЦикл: ");
        for (Season season : Season.values()){
            System.out.println("Время года: " +
                    season.name() +
                    '\n' +
                    season.toString());
        }
    }
}
