package ru.mirea.task2.opt1;
import java.lang.*;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        String email;
        Author ath1 = new Author("Ivan", "*@mail.ru", 'm');
        System.out.println("Неизмененный экземпляр класса: " + ath1.toString());
        System.out.println("Введите новый email ");
        Scanner scn = new Scanner(System.in);
        email = scn.next();
        ath1.setEmail(email);
        System.out.println("Новый экземпляр класса: " + ath1.toString());

    }
}
