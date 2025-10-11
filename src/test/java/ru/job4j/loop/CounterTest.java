package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.converter.Converter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0Finish0Then0() {
        int start = 0;
        int finish = 0;
        int actual = Counter.sum(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish5Then15() {
        int start = 1;
        int finish = 5;
        int actual = Counter.sum(start, finish);
        int expected = 15;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStart20Finish5Then0() {
        int start = 20;
        int finish = 5;
        int actual = Counter.sum(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStartMinus10FinishMinus5ThenMinus45() {
        int start = -10;
        int finish = -5;
        int actual = Counter.sum(start, finish);
        int expected = -45;
        assertThat(actual).isEqualTo(expected);
    }
}