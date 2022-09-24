package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.power(2, 3));
    }
}

class Calculator {
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}