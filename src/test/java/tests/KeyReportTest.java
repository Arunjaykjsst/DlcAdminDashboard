package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.KeyReportApi;
import core.TestSetup;
import dataprovider.KeyReportDataProvider;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import payloads.KeyReportRequestData;
import utils.AllureUtils;

public class KeyReportTest {
	KeyReportApi api;

	@BeforeClass
	public void setup() {
		TestSetup.setup();
		api = new KeyReportApi();
	}

	@Test(dataProvider = "keyReportData", dataProviderClass = KeyReportDataProvider.class)
	public void testKeyReport(KeyReportRequestData data) {

		AllureUtils.setTestName(data.getTestName());
		AllureUtils.step("Prepare Test Data");
		AllureUtils.attachRequest("Test Data", data);

		System.out.println("Running Test: " + data.getTestName());

		Response response = api.addReport( 
				data.getTestName(), 
				data.getFromDate(), 
				data.getToDate(), 
				data.getTrxnType(),
				data.getTransferType(), 
				data.getType(), 
				data.getPageNo(), 
				data.getPageSize());

		Allure.description(data.getTestName());

		// Status code validation
		Assert.assertEquals(response.getStatusCode(), data.getExpectedStatusCode(), "Status mismatch");

		// Condition Validation(only if expected is not null)
		if (data.getExpectedStatus() != null) {
			Assert.assertEquals(response.jsonPath().getString("status"), data.getExpectedStatus());
		}

	}
}
