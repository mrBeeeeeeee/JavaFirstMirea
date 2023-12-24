package ru.mirea.task7.opt7_8;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public String getPrintableName() {
        return name;
    }

    public static void printMagazines(Printable[] printableArray) {
        for (Printable printable : printableArray) {
            if (printable instanceof Magazine) {
                System.out.println(printable.getPrintableName());
            }
        }
    }
}
