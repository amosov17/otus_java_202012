package ru.otus.hw01;

import com.google.common.base.Strings;

public class HelloOtus {

    public static final String HELLO_STRING = "Guava!";

    public static void main(String[] args) {
        var guavaUser = new HelloOtus();
        System.out.println(
                new StringBuilder(guavaUser.sayGuava(3))
                    .append(" from ")
                    .append(Strings.class.getCanonicalName())
                    .toString()
        );
    }

    public String sayGuava(int times) {
        return (Strings.repeat(HELLO_STRING,times));
    }
}