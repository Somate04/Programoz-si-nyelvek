

import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.Test;
import check.CheckThat;

public class SoliloquyStructureTest {
    @Test
    public void constructor() {
        CheckThat.theClass("magic.Soliloquy")
        	.thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasMethodWithParams("main", "array of String")
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }

    @Test
    public void methodPrintStatus() {
        CheckThat.theClass("magic.Soliloquy")
            .hasMethodWithParams("printStatus", "boolean", "magic.library.Incantation", "magic.library.Incantation")
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_NONE)
                .thatReturnsNothing();
    }

    @Test
    public void methodReciteIncantations() {
        CheckThat.theClass("magic.Soliloquy")
            .hasMethodWithParams("reciteIncantations", "magic.library.Incantation", "magic.library.Incantation", "int", "boolean")
                .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
                .thatReturnsNothing();
    }
}
