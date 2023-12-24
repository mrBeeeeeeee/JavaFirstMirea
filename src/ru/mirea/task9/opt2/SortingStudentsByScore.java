package ru.mirea.task9.opt2;

import ru.mirea.task9.opt1.Student;

import java.util.Comparator;

public class SortingStudentsByScore implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(a.getScore(), b.getScore()) * -1;
    }
}
