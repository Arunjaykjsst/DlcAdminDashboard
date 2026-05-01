package utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class AllureUtils {

	public static void setTestName(String name) {
		Allure.getLifecycle().updateTestCase(test -> test.setName(name));
	}

	public static void attachRequest(String title, Object data) {
		Allure.addAttachment(title, data == null ? "NULL" : data.toString());
	}

	public static void attachResponse(String response) {
		Allure.addAttachment("Response", response);
	}

	public static void attachLog(String log) {
		Allure.addAttachment("Log", log);
	}

	@Step("{0}")
	public static void step(String message) {
		// Used for readable steps in report
	}
}