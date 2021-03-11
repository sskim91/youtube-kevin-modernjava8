package com.study.modernjava8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorServiceTest {

    @Test
    @DisplayName("더하기")
    void testCalculateAddition() throws Exception {
        Calculation calculation = (int num1, int num2) -> num1 + num2;

        int actual = calculation.calculate(1, 1);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    @DisplayName("뺄셈")
    void testCalculateSub() throws Exception {
        final Calculation calculation = new Subtraction();

        final int actual = calculation.calculate(1, 1);

        assertThat(actual).isEqualTo(0);
    }

    @Test
    @DisplayName("곱하기")
    void testCalculateMultiply() throws Exception {
        final Calculation calculation = new Multiplication();

        final int actual = calculation.calculate(1, 1);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    @DisplayName("나누기")
    void testCalculateDivide() throws Exception {
        final Calculation calculation = new Division();

        final int actual = calculation.calculate(8, 4);

        assertThat(actual).isEqualTo(2);
    }
}