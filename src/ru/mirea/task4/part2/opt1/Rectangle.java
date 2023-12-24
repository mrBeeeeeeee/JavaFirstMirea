package ru.mirea.task4.part2.opt1;
public class Rectangle extends Shape{
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType(){
        return "Rectangle";
    }
    @Override
    public double getArea(){
        return a * b;
    }
    @Override
    public double getPerimeter(){
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
