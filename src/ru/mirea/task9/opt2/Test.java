package ru.mirea.task9.opt2;
import ru.mirea.task9.opt1.Student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] students = {
                new Student(506, 3.5),
                new Student(250, 4.0),
                new Student(750, 3.2),
        };
        SortingStudentsByScore sortByScore = new SortingStudentsByScore();
        Arrays.sort(students, sortByScore);

        System.out.println("Отсортированный массив по оценкам в порядке убывания:");
        for (Student student : students) {
            System.out.println("ID: " + student.getiDNumber() + ", " + student.getScore());
        }
    }
}
