package payloads;

public class MerchantKeyTransferRequestData {
   private String testName;
   private String key;
   private String merchantId;
   private String type;
   private int expectedStatusCode;
   private String expectedStatus;
   private String description;
   
   //Getters
   public String getTestName() {
	   return testName;
   }
   public String getKey() {
	   return key;
   }
   public String getMerchantId() {
	   return merchantId;
   }
   public String getType() {
	   return type;
   }
   public int getExpectedStatusCode() {
	   return expectedStatusCode;
   }
   public String getExpectedStatus() {
	   return expectedStatus;
   }
   public String getDescription() {
	   return description ;
   }
   
	//Setters
   public void setTestName(String testName) {
	   this.testName = testName;
   }
   public void setKey(String key) {
	   this.key = key;
   }
   public void setMerchantId(String merchantId) {
	   this.merchantId=merchantId;
   }
   public void setType(String type) {
	   this.type = type;
   }
   
	public void setExpectedStatusCode(int expectedStatusCode) {
		    this.expectedStatusCode = expectedStatusCode;
		}

	public void setExpectedStatus(String expectedStatus) {
		    this.expectedStatus = expectedStatus;
		}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
