package org.example;

public class FunctoinAbc {

    public static double squareTreug(double a, double b, double c) {
        double p = 1 / 2.0 * (a + b + c);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
