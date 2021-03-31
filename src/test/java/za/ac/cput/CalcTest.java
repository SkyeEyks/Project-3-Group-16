package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalcTest {
    private Calc objCalcUnderTest;

    @BeforeEach
    public void setUp() {

        objCalcUnderTest = new Calc();
    }


    @Test
    void add() throws Exception {
        int a = 15;
        int b = 15;
        assertSame(a, b);
    }

    @Test
    void subtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 55;
        long result = objCalcUnderTest.subtract(a, b);
        assertEquals(expectedResult, result);
    }

    @Test
    void multiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = objCalcUnderTest.multiply(a, b);
        assertEquals(expectedResult, result);

    }

    @Test //(timeout = 500 )
    void divide() throws Exception {
            Thread.sleep(1000);
            System.out.println("TimeOut");

        }

    @Disabled

    @Test //(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15;
        int b = 0;
        objCalcUnderTest.divide(a, b);
    }

    }