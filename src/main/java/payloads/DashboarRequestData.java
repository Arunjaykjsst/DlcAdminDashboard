package payloads;

public class DashboarRequestData {
	String testName;
	int expectdStatusCode;
	String expectedStatus;
	int maxResponseTime;

	// Getter
	public String getTestName() {
		return testName;
	}

	public int getExpectedStatusCode() {
		return expectdStatusCode;
	}

	public String getExpectedStatus() {
		return expectedStatus;
	}

	public int getMaxResponseTime() {
		return maxResponseTime;
	}

	// Setter
	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setExpectedStatusCode(int expectdStatusCode) {
		this.expectdStatusCode = expectdStatusCode;
	}

	public void setExpectedStatus(String expectedStatus) {
		this.expectedStatus = expectedStatus;
	}

	public void setMaxResponseTime(int expectedResponseTime) {
		this.maxResponseTime = expectedResponseTime;
	}
}
