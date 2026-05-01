package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.LoggerUtil;
import utils.LogContext;
import org.slf4j.Logger;

public class TestListener implements ITestListener {

    private static final Logger log = LoggerUtil.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        LogContext.startTest();
        log.info("START: {}", result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("PASS: {}", result.getName());
        LogContext.endTest();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.error("FAIL: {}", result.getName());
        log.error("Reason: {}", result.getThrowable());
        LogContext.endTest();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.warn("SKIPPED: {}", result.getName());
        LogContext.endTest();
    }
}