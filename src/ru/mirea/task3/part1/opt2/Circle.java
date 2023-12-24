package ru.mirea.task3.part1.opt2;

public class Circle extends Point{
    protected double r = 0;

    public Circle(double x, double y, double r){
        super(x, y);
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
