package co.example.unittesting.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculatorService.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        // Arrange
        int a = 3;
        int b = 2;

        // Act
        int result = calculatorService.subtract(a, b);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void testMultiply() {
        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculatorService.multiply(a, b);

        // Assert
        assertEquals(6, result);
    }

    @Test
    void testDivide() {
        // Arrange
        int a = 6;
        int b = 3;

        // Act
        int result = calculatorService.divide(a, b);

        // Assert
        assertEquals(2, result);
    }

    @Test
    void testDivideByZero() {
        // Arrange
        int a = 1;
        int b = 0;

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(a, b);
        });

        String expectedMessage = "Division by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
