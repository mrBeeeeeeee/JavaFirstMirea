package ru.mirea.task2.opt3;

public class Circle {
    Point center = new Point();
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
