package famous.sequence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest{
    @Test
    public void fibTest0(){
        assertEquals(0, Fibonacci.fib(0));
    } 

    @Test
    public void fibTest1(){
        assertEquals(1, Fibonacci.fib(10));
    }

    @Test
    public void fibTest2(){
        assertEquals(55, Fibonacci.fib(10));
    }

    @Test
    @CsvSource(textBlock = """
    0,0
    1,0
    55,10
    1,55
    2,1
    """)
    public void fibTest3(int expected, int n){
        assertEquals(expected, Fibonacci.fib(n));
    }
}