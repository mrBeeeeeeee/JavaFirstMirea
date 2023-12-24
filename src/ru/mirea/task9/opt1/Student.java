package ru.mirea.task9.opt1;

public class Student {
    int iDNumber;
    double score = 0;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public Student(int iDNumber, double score) {
        this.iDNumber = iDNumber;
        this.score = score;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

