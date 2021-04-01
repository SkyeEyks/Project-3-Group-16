package za.ac.cput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {

    Student student1, student2;

    @BeforeEach
    void setUp(){
        student1 = new Student();
        student2 = new Student();
    }

    @Test
    void testEquality() {
        assertEquals(student1, student2);
    }

    @Test
    void testIdentity(){
        assertSame(student1, student2);
    }

    @Test
    void testFail(){
        fail("Deliberately failing");
    }

    @Test
    @Timeout(10)
    void testWithTimeout(){
        student1.getYearStipend();
    }

    @Test
    @Disabled
    void ignoreTest() {
        fail("I Failed");
    }
}

