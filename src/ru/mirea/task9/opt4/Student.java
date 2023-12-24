package ru.mirea.task9.opt4;

public class Student implements Comparable<Student>{
    int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student student){
        return Integer.compare(this.iDNumber, student.iDNumber);
    }
}
