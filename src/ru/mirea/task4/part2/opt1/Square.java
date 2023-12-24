package ru.mirea.task4.part2.opt1;

public class Square extends Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getType(){
        return "Square";
    }
    @Override
    public double getArea(){
        return a * a;
    }
    @Override
    public double getPerimeter(){
        return 4*a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
