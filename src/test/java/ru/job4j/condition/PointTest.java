package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {
    @Test
    void whenPoints00And20Then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints11And11Then0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double expected = 0;
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1Minus1And1And1And1Then3Dot46() {
        Point a = new Point(-1, -1, -1);
        Point b = new Point(1, 1, 1);
        double expected = 3.46;
        double actual = a.distance3d(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints11And11And11Then0() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 1);
        double expected = 0;
        double actual = a.distance3d(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }
}