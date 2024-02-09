package nl.axians;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest  {

    @Test
    public void testCrashExample1() {
        Example1 example = new Example1();
        example.start();
    }

    @Test
    public void testExample1() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Example1 example = new Example1();
            example.start();
        });

        String expectedMessage = "/ by zero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void testExample2() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Example2 example = new Example2();
            example.start();
        });

        String expectedMessage = "The denominator must not be zero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        exception.printStackTrace();
    }

    @Test
    public void testExample3() {
        Example3 example = new Example3();
        assertDoesNotThrow(() -> example.start());
    }

    @Test
    public void testExample4() {
        Exception exception = assertThrows(Exception.class, () -> {
            Example4 example = new Example4();
            example.start();
        });

        String expectedMessage = "Oh noo exception";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testExample5() {
        Exception exception = assertThrows(Exception.class, () -> {
            Example5 example = new Example5();
            example.start();
        });

        String expectedMessage = "Oh noo exception";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testExample6() {
        Exception exception = assertThrows(Exception.class, () -> {
            Example6 example = new Example6();
            example.start();
        });

        String expectedMessage = "Oh noo exception";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(exception.getCause().getClass(), ZeroBarsNotAllowedCheckedException.class);
        exception.printStackTrace();

    }
}
