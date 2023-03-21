
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.Test;
import check.CheckThat;

public class IncantationStructureTest {
    @Test
    public void fieldText() {
        CheckThat.theClass("magic.library.Incantation")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasFieldOfType("text", String.class)
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER)
                .thatHasNo(SETTER);
    }

    @Test
    public void fieldIndex() {
        CheckThat.theClass("magic.library.Incantation")
            .hasFieldOfType("index", int.class)
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHas(GETTER, SETTER);
    }

    @Test
    public void constructor01() {
        CheckThat.theClass("magic.library.Incantation")
            .hasConstructorWithParams("Incantation")
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void constructor02() {
        CheckThat.theClass("magic.library.Incantation")
            .hasConstructorWithParams(String.class, int.class)
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodEnchant() {
        CheckThat.theClass("magic.library.Incantation")
            .hasMethodWithParams("enchant", "Incantation", "boolean")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns(boolean.class);
    }
}
