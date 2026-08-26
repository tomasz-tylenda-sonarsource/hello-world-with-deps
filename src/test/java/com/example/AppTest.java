package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    private final App app = new App();

    @Test
    void greetsCapitalizedName() {
        assertEquals("Hello, Alice!", app.greeting("alice"));
    }

    @Test
    void trimsWhitespaceAroundName() {
        assertEquals("Hello, Bob!", app.greeting("  bob  "));
    }

    @Test
    void fallsBackToWorldWhenNameIsBlank() {
        assertEquals("Hello, World!", app.greeting("   "));
    }

    @Test
    void fallsBackToWorldWhenNameIsNull() {
        assertEquals("Hello, World!", app.greeting(null));
    }
}
