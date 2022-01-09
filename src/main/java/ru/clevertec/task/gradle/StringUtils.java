package ru.clevertec.task.gradle;


public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return new org.apache.commons.lang3.StringUtils().isNumeric(str);
    }
}
