package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void addReturnsSum() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void multiplyReturnsProduct() {
        assertEquals(12, App.multiply(3, 4));
    }

    @Test
    void handlesNegativeNumbers() {
        assertEquals(-1, App.add(2, -3));
    }
}
