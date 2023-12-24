package ru.mirea.task7.opt4;

public class MathFunc implements MathCalculable{
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double absolute(double number) {
        return Math.abs(number);
    }

    @Override
    public double getPI() {
        return Math.PI;
    }
}

