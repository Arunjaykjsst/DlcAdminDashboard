package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.MerchantLedgerApi;
import core.TestSetup;
import dataprovider.MerchantLedgerDataProvider;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import payloads.MerchantLedgerData;
import utils.AllureUtils;

public class MerchantLedgerTest {
	MerchantLedgerApi api;
		@BeforeClass
		public void setup() {
			TestSetup.setup();
			api = new MerchantLedgerApi();
		}
		@Test(dataProvider = "merchantLedgerData", dataProviderClass = MerchantLedgerDataProvider.class )
		public void testMerchantLedger(MerchantLedgerData data) {
			
			
			            AllureUtils.setTestName(data.getTestName());
      	                AllureUtils.step("Prepare Test Data");
                        AllureUtils.attachRequest("Test Data", data);
            
	         		System.out.println("Running Test: " + data.getTestName());
	         		
	                Response response = api.merchantLedger(
	                		 data.getFromDate(),
	                		 data.getToDate(),
	                		 data.getMerchantId(),
	                		 data.getTrxnType(), 
	                		 data.getTransferType(),
	                		 data.getType(), 
	                		 data.getPageNo(), 
	                		 data.getPageSize()
	                		 );
	                 
	                Allure.description(data.getTestName());
	                
	                 //Status code validation
	            	 Assert.assertEquals(response.getStatusCode(), data.getExpectedStatusCode());
	            	 
	            	 //Condition Validation(only if expected is not null)
	            	 if(data.getExpectedStatus() != null) {
	            		 Assert.assertEquals(response.jsonPath().getString("status"), data.getExpectedStatus());
	            	 }             
		}		
	}
		

