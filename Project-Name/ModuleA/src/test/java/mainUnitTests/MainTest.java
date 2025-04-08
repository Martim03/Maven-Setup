package mainUnitTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import submodule.Main;

public class MainTest {

    @Test
    public void testGreet() {
        String result = Main.greet("Name");
        assertEquals("Hello, Name!", result);
    }
}
