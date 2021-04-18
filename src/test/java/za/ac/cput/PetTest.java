package za.ac.cput;

/*
    Author: BOKANG MOLAOA 218131097
    Date: 01 March 2021
    PetTest.java
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    private Pet pet1;
    private Pet pet2;

    @BeforeEach
    void setUp() {
        pet1 = new Pet();
        pet2 = new Pet();
    }

    @Test
    void testEquality() {
        assertEquals(pet1, pet2);
    }

    @Test
    void testIdentity() {
        assertSame(pet1, pet2);
    }

    @Test
    void testFail() {
        if(pet1 == null)
            fail("Test result to fail");
    }

    @Test
    @Timeout(500)
    void testWithTimeout() {
        System.out.println("Show details");
    }

    @Test
    @Disabled("Disable Test")
    void testDisable() {
        System.out.println("Disabled");
    }
}