package ru.mirea.task7.opt7_8;


public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }
    @Override
    public String getPrintableName() {
        return name;
    }
    public static void printBooks(Printable[] printableArray) {
        for (Printable printable : printableArray) {
            if (printable instanceof Book) {
                System.out.println(printable.getPrintableName());
            }
        }
    }

}
