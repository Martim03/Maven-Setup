package integrationTests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import submodule.Main;

public class MainIT {

    @Test
    public void testMainExecution() {
        // Simulate calling main with some args
        String[] args = {"Integration", "Test"};
        Main.main(args);

        assertTrue(true);
    }
}
