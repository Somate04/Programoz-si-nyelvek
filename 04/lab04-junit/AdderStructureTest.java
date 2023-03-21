

import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.Test;
import check.CheckThat;

public class AdderStructureTest {
    @Test
    public void methodAddAsText() {
        CheckThat.theClass("math.operation.textual.Adder")
        	.thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasMethodWithParams("addAsText", String.class, String.class)
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns(String.class);
    }

}

