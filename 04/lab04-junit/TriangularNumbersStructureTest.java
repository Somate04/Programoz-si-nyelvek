

import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.Test;
import check.CheckThat;

public class TriangularNumbersStructureTest {
    @Test
    public void methodGetTriangularNumber() {
        CheckThat.theClass("famous.sequence.TriangularNumbers")
        	.thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasMethodWithParams("getTriangularNumber", int.class)
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
                .thatReturns(int.class);
    }

    @Test
    public void methodGetTriangularNumberAlternative() {
        CheckThat.theClass("famous.sequence.TriangularNumbers")
            .hasMethodWithParams("getTriangularNumberAlternative", int.class)
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
                .thatReturns(int.class);
    }

}

