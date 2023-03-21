

import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.Test;
import check.CheckThat;

public class IncrementStructureTest {
    @Test
    public void methodIncrement() {
        CheckThat.theClass("math.operation.safe.Increment")
        	.thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasMethodWithParams("increment", int.class)
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
                .thatReturns(int.class);
    }

}

