package co.example.unittesting.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    void testGreet() {
        // Arrange
        String name = "John";

        // Act
        String result = greetingService.greet(name);

        // Assert
        assertEquals("Hello, John!", result);
    }

    @Test
    void testGreetWithNull() {
        // Arrange
        String name = null;

        // Act
        String result = greetingService.greet(name);

        // Assert
        assertEquals("Hello, null!", result);
    }

    @Test
    void testGreetWithEmptyString() {
        // Arrange
        String name = "";

        // Act
        String result = greetingService.greet(name);

        // Assert
        assertEquals("Hello, !", result);
    }
}
