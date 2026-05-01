package utils;

import org.slf4j.MDC;
import java.util.UUID;

public class LogContext {

    private static final String TEST_ID = "testId";

    public static void startTest() {
        MDC.put(TEST_ID, "TEST-" + UUID.randomUUID().toString().substring(0, 6));
    }

    public static void endTest() {
        MDC.clear();
    }
}