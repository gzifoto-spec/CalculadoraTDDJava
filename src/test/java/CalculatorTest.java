import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("Addition")
    class AdditionTests {

        @Test
        @DisplayName("Should return correct sum of two positive numbers")
        void shouldAddTwoPositiveNumbers() {
            assertEquals(10.0, calculator.add(4, 6));
        }

        @Test
        @DisplayName("Should return correct sum when adding a negative number")
        void shouldAddNegativeNumber() {
            assertEquals(1.0, calculator.add(5, -4));
        }

        @Test
        @DisplayName("Should return zero when adding a number and its negative")
        void shouldReturnZeroWhenAddingOpposites() {
            assertEquals(0.0, calculator.add(7, -7));
        }

        @Test
        @DisplayName("Should return correct sum of two decimal numbers")
        void shouldAddDecimalNumbers() {
            assertEquals(0.3, calculator.add(0.1, 0.2), 0.0001);
        }
    }

    @Nested
    @DisplayName("Subtraction")
    class SubtractionTests {

        @Test
        @DisplayName("Should return correct difference of two positive numbers")
        void shouldSubtractTwoPositiveNumbers() {
            assertEquals(5.0, calculator.subtract(10, 5));
        }

        @Test
        @DisplayName("Should return negative result when subtracting larger from smaller")
        void shouldReturnNegativeWhenResultIsNegative() {
            assertEquals(-3.0, calculator.subtract(2, 5));
        }

        @Test
        @DisplayName("Should return zero when subtracting equal numbers")
        void shouldReturnZeroWhenSubtractingEqualNumbers() {
            assertEquals(0.0, calculator.subtract(8, 8));
        }

        @Test
        @DisplayName("Should return correct result when subtracting a negative number")
        void shouldSubtractNegativeNumber() {
            assertEquals(8.0, calculator.subtract(5, -3));
        }
    }

    @Nested
    @DisplayName("Multiplication")
    class MultiplicationTests {

        @Test
        @DisplayName("Should return correct product of two positive numbers")
        void shouldMultiplyTwoPositiveNumbers() {
            assertEquals(20.0, calculator.multiply(4, 5));
        }

        @Test
        @DisplayName("Should return negative product when one operand is negative")
        void shouldReturnNegativeProductWithOneNegative() {
            assertEquals(-12.0, calculator.multiply(3, -4));
        }

        @Test
        @DisplayName("Should return positive product when both operands are negative")
        void shouldReturnPositiveProductWithTwoNegatives() {
            assertEquals(6.0, calculator.multiply(-2, -3));
        }

        @Test
        @DisplayName("Should return zero when multiplying by zero")
        void shouldReturnZeroWhenMultiplyingByZero() {
            assertEquals(0.0, calculator.multiply(99, 0));
        }
    }

    @Nested
    @DisplayName("Division")
    class DivisionTests {

        @Test
        @DisplayName("Should return correct quotient of two positive numbers")
        void shouldDivideTwoPositiveNumbers() {
            assertEquals(5.0, calculator.divide(10, 2));
        }

        @Test
        @DisplayName("Should return decimal result for non-integer division")
        void shouldReturnDecimalResult() {
            assertEquals(2.5, calculator.divide(5, 2));
        }

        @Test
        @DisplayName("Should return negative result when dividing by a negative number")
        void shouldReturnNegativeWhenDividingByNegative() {
            assertEquals(-3.0, calculator.divide(9, -3));
        }

        @Test
        @DisplayName("Should return positive result when both operands are negative")
        void shouldReturnPositiveWhenBothNegative() {
            assertEquals(2.0, calculator.divide(-8, -4));
        }

        @Test
        @DisplayName("Should throw ArithmeticException when dividing by zero")
        void shouldThrowExceptionWhenDividingByZero() {
            ArithmeticException exception = assertThrows(
                    ArithmeticException.class,
                    () -> calculator.divide(10, 0)
            );
            assertEquals("Division by zero is not allowed", exception.getMessage());
        }
    }
}