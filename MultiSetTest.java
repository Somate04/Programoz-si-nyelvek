package data.structure;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.*;

public class MultiSetTest{

    MultiSet<Integer> multiSetInteger = new MultiSet<Integer>(1,2,3,4,5,6,7,7,7,7,7,5,43,2);
    MultiSet<String> multiSetString = new MultiSet<String>("alma", "alma", "körte", "barack", "barack", "barack");
    MultiSet<Integer> multiSetIntegerToBeIntersected = new MultiSet<Integer>(1);


    @Test
    public void addTest(){
        assertEquals(5, multiSetInteger.getCount(7));
        assertEquals(0, multiSetInteger.getCount(11));
        assertEquals(2, multiSetString.getCount("alma"));

        assertEquals(6, multiSetInteger.add(7));
        assertEquals(6, multiSetInteger.getCount(7));
    }

    @Test
    public void intersectTest(){
        assertEquals(new MultiSet<Integer>(1), multiSetInteger.intersect(multiSetIntegerToBeIntersected));

    }
}