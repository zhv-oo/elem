package ru.core.convert;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert190RblThen2Euro() {
        float input = 190;
        float expected = 2;
        float output = Converter.rubToEu(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert285RblThen3dot3333Euro() {
        float input = 285;
        float expected = 3;
        float output = Converter.rubToEu(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert264RblThen3Dollar() {
        float input = 264;
        float expected = 3;
        float output = Converter.rubToDol(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}