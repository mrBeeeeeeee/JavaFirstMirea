package ru.mirea.task3.part1.opt2;
import java.util.Arrays;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int length;

    public Tester() {
        this.circles = null;
        this.length = 0;
    }
    public Tester(Circle[] circles) {
        this.circles = circles;
        this.length = circles.length;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
        this.length = circles.length;
    }

    public int getLength() {
        return length;
    }

    public void generateCircles(int length){
        Random rand = new Random();
        this.length = length;
        Circle[] circles1 = new Circle[length];

        for (int i = 0; i < length; i++) {
            circles1[i] = new Circle(rand.nextDouble(20), rand.nextDouble(20),
                    rand.nextDouble(100));
        }
        this.circles = circles1;
    }
    public Circle minCircle(){
        if(length == 0)
            return null;
        Circle minC = circles[0];
        for (int i = 1; i < length; i++) {
            if(minC.getR() > circles[i].getR())
                minC = circles[i];
        }
        return minC;
    }
    public Circle maxCircle(){
        if(length == 0)
            return null;
        Circle maxC = circles[0];
        for (int i = 1; i < length; i++) {
            if(maxC.getR() < circles[i].getR())
                maxC = circles[i];
        }
        return maxC;
    }

    public void sort(){
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1-i; j++) {
                if(circles[j].getR() > circles[j+1].getR()) {
                    Circle tmp = circles[j + 1];
                    circles[j + 1] = circles[j];
                    circles[j] = tmp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Tester{ " +
                "circles=" + Arrays.toString(circles) +
                ", length=" + length +
                '}';
    }
}
