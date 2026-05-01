package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.MerchantKeyTransferApi;
import core.TestSetup;
import dataprovider.MerchantKeyTransferDataProvider;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import payloads.MerchantKeyTransferRequestData;
import utils.AllureUtils;

public class MerchantKeyTransferTest {
   MerchantKeyTransferApi api;
	@BeforeClass
	public void setup() {
		TestSetup.setup();
		api = new MerchantKeyTransferApi();
	}
	@Test(dataProvider = "merchantKeyTransferData", dataProviderClass = MerchantKeyTransferDataProvider.class )
	public void testMerchantKeyTransfer(MerchantKeyTransferRequestData data) {
		
	                	AllureUtils.setTestName(data.getTestName());
	              	    AllureUtils.step("Prepare Test Data");   
		                AllureUtils.attachRequest("Test Data", data);
		                
         		System.out.println("Running Test: " + data.getTestName());
         		
                 Response response = api.merchantKeyTransfer(data.getKey(), data.getMerchantId(), data.getType());
                 
                 Allure.description(data.getTestName());
                 
                 
               
            	 Assert.assertEquals(response.getStatusCode(), data.getExpectedStatusCode());   //Status code validation
            	 
            	 //Condition Validation(only if expected is not null)
            	 if(data.getExpectedStatus() != null) {
            		 String actualStatus = response.jsonPath().getString("status");
            		 Assert.assertEquals(actualStatus, data.getExpectedStatus());
            	 }
            	
            	 //Validating description
            	 String actualDescription = response.jsonPath().getString("description");
            	 Assert.assertEquals(actualDescription,data.getDescription() );
}		
}
	
	
