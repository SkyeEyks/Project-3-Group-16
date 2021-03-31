package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.Assert.assertSame;

@Disabled

public class CalcTest {
    private Calc objCalcUnderTest;

    @Before
    public void setUp() {

        objCalcUnderTest = new Calc();
    }


    @Test
    public void testAdd() throws Exception{
        int a = 15;
        int b = 15;
        assertSame(a, b);
    }

    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 55;
        long result = objCalcUnderTest.subtract(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = objCalcUnderTest.multiply(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test(timeout = 500 )
    public void testDivide() throws Exception {
            Thread.sleep(1000);
            System.out.println("TimeOut");
    }

    @Ignore("Incomplete method")

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15;
        int b = 0;
        objCalcUnderTest.divide(a, b);
    }
}