
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void greetingMessageIsCorrect() {
        String response = "Hello from Docker Java App!";

        assertEquals("Hello from Docker Java App!", response);
    }
}
