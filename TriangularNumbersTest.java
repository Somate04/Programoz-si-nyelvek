package famous.sequence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangularNumbersTest{
    @Test
    public void Test01(){
        assertEquals(0, TriangularNumbers.getTriangularNumber(0));
    }

    @Test
    public void Test02(){
        assertEquals(1, TriangularNumbers.getTriangularNumber(1));
    }

    @Test
    public void Test03(){
        assertEquals(5050, TriangularNumbers.getTriangularNumber(100));
    }

    @Test
    public void Test04(){
        assertEquals(0, TriangularNumbers.getTriangularNumber(-1));
    }

    @Test
    public void Test05(){
        assertEquals(1, TriangularNumbers.getTriangularNumber(-2));
    }

    @Test
    public void Test06(){
        assertEquals(456, TriangularNumbers.getTriangularNumber(0));
    }

    @Test
    public void Test07(){
        assertEquals(5050, TriangularNumbers.getTriangularNumberAlternative(100));
    }
}