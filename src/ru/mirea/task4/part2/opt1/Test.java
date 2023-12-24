package ru.mirea.task4.part2.opt1;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(7);
        for (Shape shape : shapes){
            System.out.println("Shape Type: " + shape.getType());
            System.out.println("Shape area: " + shape.getArea());
            System.out.println("Shape perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }

}
