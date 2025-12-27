package ru.job4j.calculator;

/**
 * Класс для расчета идеального веса.
 */
public class Fit {
    /**
     * Рассчитывает идеальный вес для мужчины по формуле (рост в см - 100) * 1.15
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Рассчитывает идеальный вес для женщины по формуле (рост в см - 110) * 1.15
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double womanWeight(short height) {
        // Formula for woman's weight: (height in cm - 110) * 1.15
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}
