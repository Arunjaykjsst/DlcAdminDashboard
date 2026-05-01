package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.KeyAddApi;
import core.TestSetup;
import dataprovider.KeyAddTestDataProvider;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import payloads.KeyAddRequestData;
import utils.AllureUtils;

public class KeyAddTest {
	KeyAddApi api;

	@BeforeClass
	public void setup() {
		TestSetup.setup();
		api = new KeyAddApi();
	}

	@Test(dataProvider = "keyAddData", dataProviderClass = KeyAddTestDataProvider.class)
	public void testKeyReport(KeyAddRequestData data) {

		AllureUtils.setTestName(data.getTestName());
		AllureUtils.step("Prepare Test Data");
		AllureUtils.attachRequest("Test Data", data);

		System.out.println("Running Test: " + data.getTestName());

		AllureUtils.step("Call API");

		Response response = api.addKey(data.getKey());

		Allure.description(data.getTestName());

//		Status code validation
		Assert.assertEquals(response.getStatusCode(), data.getExpectedStatusCode(), "Status code mismatch");

		if (data.getExpectedStatus() != null) {
			Assert.assertEquals(response.jsonPath().getString("status"), data.getExpectedStatus());
		}

	}
}
