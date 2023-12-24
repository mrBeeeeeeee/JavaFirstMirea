package ru.mirea.task6.from6to9;

public class Magazine implements Printable{
    private String text;

    public Magazine(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("Текст журнала:\n\"" + text + "\"");
    }
}
