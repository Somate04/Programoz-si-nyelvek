package array.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArrayUtilTest{
    @Test
    public static void maxLength0(){
        assertEquals(0, ArrayUtil.max(new int[]{}));
        assertEquals(0, ArrayUtil.max2(new int[]{}));
        assertEquals(0, ArrayUtil.max3(new int[]{}));
        assertEquals(0, ArrayUtil.max4(new int[]{}));
    }
    /*
    // @ParameterizedTest
    // @CsvSource(textBlock = """
    //     1, {1}
    //     2, {2}
    //     3, {3}
    //     4, {4}
    //     """
    // )
    public static void maxLength1(){
        
    }
    */
}