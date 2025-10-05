package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static ru.job4j.calculator.Fit.manWeight;
import static ru.job4j.calculator.Fit.womanWeight;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMan175Then86dot25() {
        short input = 175;
        double expected = 86.25;
        double output = manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman165Then63dot25() {
        short input = 165;
        double expected = 63.25;
        double output = womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}