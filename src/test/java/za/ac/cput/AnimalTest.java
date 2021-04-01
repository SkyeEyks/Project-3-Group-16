package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal hlum1;
    private Animal hlum2;
    private Animal hlum3;

    @BeforeEach
    void setUp() {
        hlum1 = new Animal();
        hlum2 = new Animal();
        hlum3 = hlum2;
    }

    @Test
    void testIdentity () {
        assertSame(hlum2, hlum3);
    }
    @Test
    private void assertSame (Animal hlum2, Animal hlum3){
    }

    @Test
    void testEquality () {
        assertEquals(hlum1, hlum1);
    }

    @Test
    @Disabled
    void testDisable () {
        assertEquals(hlum1, hlum1);
    }
    @Test
    @Timeout(600)
    public void testWithTimeout()
    {
        System.out.println("Timeout");

    }

    @Test
    void testGetId () {
        fail(" not implemented");
        System.out.println("getId");
        String expResult = "24";
        hlum2.setAge("24");
        String result = hlum2.getAge();
        assertEquals(expResult, result);

    }
}