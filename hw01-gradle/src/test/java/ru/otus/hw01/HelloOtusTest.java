package ru.otus.hw01;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка, что загрузился и отработал класс из Guava ")
public class HelloOtusTest {

    @Test
    public void testSayGuava() {
        HelloOtus guavaUser = new HelloOtus();
        String result = guavaUser.sayGuava(1);
        assertEquals(result, HelloOtus.HELLO_STRING);
    }
}