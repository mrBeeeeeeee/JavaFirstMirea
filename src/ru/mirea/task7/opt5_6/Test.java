package ru.mirea.task7.opt5_6;

public class Test {
    public static void main(String[] args) {
        ProcessStrings stringFunc = new ProcessStrings();
        String input = "Hola Muchachos";

        System.out.println("Количество символов: " + stringFunc.countCharacters(input));
        System.out.println("Строка с нечетными символами: " + stringFunc.getOddCharacters(input));
        System.out.println("Инвертированная строка: " + stringFunc.reverseString(input));
    }
}
