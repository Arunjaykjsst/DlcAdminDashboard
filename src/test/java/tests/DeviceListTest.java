package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.DeviceListApi;
import core.TestSetup;
import dataprovider.DeviceListDataProvider;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import payloads.DeviceListRequestData;
import utils.AllureUtils;

public class DeviceListTest {
   DeviceListApi api;
   
   @BeforeClass
   public void setup() {
	   TestSetup.setup();
	   api = new DeviceListApi();
   }
   
   @Test(dataProvider ="deviceListData", dataProviderClass = DeviceListDataProvider.class)
   public void testDeviceList(DeviceListRequestData data) {
	   
	     AllureUtils.setTestName(data.getTestName());
         AllureUtils.step("Prepare Test Data");
         AllureUtils.attachRequest("Test Data", data);
	   
	   System.out.println("Running Test: " + data.getTestName());
	   
	   Response response = api.deviceList(
			   data.getFromDate(), 
			   data.getToDate(), 
			   data.getImei1(),
			   data.getMerchantId(), 
			   data.getPageNo(), 
			   data.getPageSize(), 
			   data.getDeviceId(),
			   data.getType(),
			   data.getStatus()
			   );
	   
	   Allure.description(data.getTestName());
	   //Status code validation
		 Assert.assertEquals(response.getStatusCode(), data.getExpectedStatusCode());
		 
		 
		 // description and Status validation.
		 String description = response.jsonPath().getString("description");
		 String status = response.jsonPath().getString("status");

		 if ("Data Not Found".equals(description)) {
		     Assert.assertEquals(status, "Failed", "Status should be Failed when description is Data Not Found");
		 }else if(data.getExpectedStatus() != null){
			 Assert.assertEquals(response.jsonPath().getString("status"), data.getExpectedStatus());
		 }
   }
   
}
