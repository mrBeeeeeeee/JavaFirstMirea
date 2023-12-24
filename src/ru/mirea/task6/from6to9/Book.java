package ru.mirea.task6.from6to9;

public class Book implements Printable{
    private String text;

    public Book(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("Текст книги:\n\"" + text + "\"");
    }
}
