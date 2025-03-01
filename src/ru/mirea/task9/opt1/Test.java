package ru.mirea.task9.opt1;

public class Test {
    static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].iDNumber > key.iDNumber) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(5),
                new Student(8),
                new Student(1),
                new Student(4),
                new Student(2),
        };
        System.out.println("Массив до сортировки:");
        for (Student student : students) {
            System.out.println("ID: " + student.iDNumber);
        }

        insertionSort(students);

        System.out.println("\nМассив после сортировки:");
        for (Student student : students) {
            System.out.println("ID: " + student.iDNumber);
        }
    }
}
