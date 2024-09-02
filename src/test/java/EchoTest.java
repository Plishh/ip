import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class EchoTest {
    private Echo echo;

    @BeforeEach
    void setUp() {
        echo = new Echo("testData/tasks.txt");
    }

    @Test
    void testEchoInitialization() {
        assertNotNull(echo);
    }
}
