package ru.clevertec.task.gradle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class StringUtilsTest {
    private StringUtils stringUtils = new StringUtils();

    @Test
    public void isNegativeInt() {
        assertFalse(stringUtils.isPositiveNumber("-123"));
    }

    @Test
    public void isPositiveInt() {
        assertFalse(stringUtils.isPositiveNumber("+123"));
    }

    @Test
    public void isCorrectPositiveInt() {
        assert(stringUtils.isPositiveNumber("54432"));
    }

    @Test
    public void isString() {
        assertFalse(stringUtils.isPositiveNumber("asdas"));
    }

    @Test
    public void isPositiveInteger() {
        assertFalse(stringUtils.isPositiveNumber("+123.312"));
    }

    @Test
    public void isNegativeInteger() {
        assertFalse(stringUtils.isPositiveNumber("-123.321312"));
    }



}