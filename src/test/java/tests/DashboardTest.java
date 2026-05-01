package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.DashboardApi;
import core.TestSetup;
import dataprovider.DashboardDataProvider;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import payloads.DashboarRequestData;
import utils.AllureUtils;

public class DashboardTest {

	DashboardApi api;

	@BeforeClass
	public void setup() {
		TestSetup.setup();
		api = new DashboardApi();
	}

	@Test(dataProvider = "dashboardData", dataProviderClass = DashboardDataProvider.class)
	public void testDeviceList(DashboarRequestData data) {
        
		AllureUtils.setTestName(data.getTestName());
		AllureUtils.step("Prepare Test Data");
		AllureUtils.attachRequest("Test Data", data);
		
		System.out.println("Running Test: " + data.getTestName());
		Response response = api.dashboard();

		// Status code validation
		Assert.assertEquals(response.getStatusCode(), data.getExpectedStatusCode());

		// Condition Validation(only if expected is not null)
		if (data.getExpectedStatus() != null) {
			Assert.assertEquals(response.jsonPath().getString("status"), data.getExpectedStatus());
		}
		
		Allure.description(data.getTestName());
		
		// Response time validation.
		Assert.assertTrue(response.getTime() <= data.getMaxResponseTime(),
				"Response time is too high. Actual: " + response.getTime());

		Assert.assertEquals(response.jsonPath().getString("status"), "Success");
		Assert.assertEquals(response.jsonPath().getString("code"), "0x0200");

		Assert.assertNotNull(response.jsonPath().get("data"));
		Assert.assertNotNull(response.jsonPath().get("description"));
		Assert.assertNotNull(response.jsonPath().get("key"));

		Assert.assertNotNull(response.jsonPath().get("data.totalDevices"));
		Assert.assertNotNull(response.jsonPath().get("data.totalSuccessMandate"));
		Assert.assertNotNull(response.jsonPath().get("data.totalSuccessDebit"));

		Assert.assertTrue(response.jsonPath().getInt("data.totalDevices") >= 0);
		Assert.assertTrue(response.jsonPath().getInt("data.totalPendingMandate") >= 0);

		int total = response.jsonPath().getInt("data.totalDevices");
		int active = response.jsonPath().getInt("data.totalActiveDevices");
		int inactive = response.jsonPath().getInt("data.totalInactiveDevices");
		int locked = response.jsonPath().getInt("data.totalLockedDevices");
		int released = response.jsonPath().getInt("data.totalReleasedDevices");

		Assert.assertTrue(total >= active + inactive + locked + released);

		Assert.assertTrue(response.jsonPath().getInt("data.totalSuccessDebit") >= 0);

		if (data.getMaxResponseTime() > 0) {
			Assert.assertTrue(response.getTime() < data.getMaxResponseTime());
		}

	}

}
