package ru.otus.hw01;

import com.google.common.base.Strings;

public class HelloOtus {

    public static final String HELLO_STRING = "Guava!";

    public static void main(String[] args) {
        System.out.println(
            new StringBuilder(Strings.repeat(HELLO_STRING,3))
                .append(" from ")
                .append(Strings.class.getCanonicalName())
                .toString()
        );   
    }
}