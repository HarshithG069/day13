package com.company;

public class Maxof3int {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6, 8, 7, maximum(6,
                8, 7));
    }
}

