package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumStart0Finish0Then0() {
        int start = 0;
        int finish = 0;
        int actual = Counter.sum(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumStart1Finish5Then15() {
        int start = 1;
        int finish = 5;
        int actual = Counter.sum(start, finish);
        int expected = 15;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumStart20Finish5Then0() {
        int start = 20;
        int finish = 5;
        int actual = Counter.sum(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumStartMinus10FinishMinus5ThenMinus45() {
        int start = -10;
        int finish = -5;
        int actual = Counter.sum(start, finish);
        int expected = -45;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersStart1FinishThen6() {
        int start = 1;
        int finish = 6;
        int actual = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersStart0Finish0Then0() {
        int start = 0;
        int finish = 0;
        int actual = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersStartMinus5Finish2Then0() {
        int start = -5;
        int finish = 2;
        int actual = Counter.sumByEven(start, finish);
        int expected = -4;
        assertThat(actual).isEqualTo(expected);
    }
}