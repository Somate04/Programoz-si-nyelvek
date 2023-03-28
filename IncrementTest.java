package math.operator.safe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IncrementTest{
    @Test
    public void Test1(){
        assertEquals(1, Increment.increment(0));
    }

    @Test
    public void Test2(){
        assertEquals((Integer.MIN_VALUE + 1), Increment.increment(Integer.MIN_VALUE));
    }

    @Test
    public void Test3(){
        assertEquals(Integer.MAX_VALUE, Increment.increment(Integer.MAX_VALUE));
    }

    @Test
    public void Test4(){
        assertEquals(Integer.MAX_VALUE/2+1, Increment.increment(Integer.MAX_VALUE/2));
    }

    @Test
    public void Test5(){
        assertEquals((Integer.MAX_VALUE/2)*(-1)+1, Increment.increment(Integer.MAX_VALUE/2*(-1)));
    }

    @Test
    public void Test6(){
        assertEquals(0, Increment.increment(-1));
    }
}