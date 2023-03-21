

import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.Test;
import check.CheckThat;

public class CaesarCipherStructureTest {
    @Test
    public void fieldShift() {
        CheckThat.theClass("cipher.CaesarCipher")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasFieldOfType("shift", int.class)
                .thatIs(INSTANCE_LEVEL, MODIFIABLE, VISIBLE_TO_NONE)
                .thatHasNo(GETTER, SETTER);
    }

    @Test
    public void constructor() {
        CheckThat.theClass("cipher.CaesarCipher")
            .hasConstructorWithParams(int.class)
                .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodDecrypt() {
        CheckThat.theClass("cipher.CaesarCipher")
            .hasMethodWithParams("decrypt", String.class)
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns(String.class);
    }

    @Test
    public void methodEncrypt() {
        CheckThat.theClass("cipher.CaesarCipher")
            .hasMethodWithParams("encrypt", String.class)
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .thatReturns(String.class);
    }
}
