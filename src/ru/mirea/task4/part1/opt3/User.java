package ru.mirea.task4.part1.opt3;

public class User {
    private String login;
    private String password;

    public User(String login, String password){
        this.login = login;
        this.password = password;
        System.out.println("Вы успешно авторезировались!");
    }
}
