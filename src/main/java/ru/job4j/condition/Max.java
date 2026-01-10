package ru.job4j.condition;

public class Max {
    public int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        int maxFromThree = max(a, b, c);
        return max(maxFromThree, d);
    }
}
