package ru.mirea.task6.from6to9;

public class Test {
    public static void main(String[] args) {
        Printable[] texts = new Printable[2];
        texts[0] = new Book("Давным-давно жили дед да бабка и все!");
        texts[1]  = new Magazine("В данной статье пойдет разговор о глобализации глобализации.");

        for (Printable printable : texts){
            printable.print();
        }

    }
}
