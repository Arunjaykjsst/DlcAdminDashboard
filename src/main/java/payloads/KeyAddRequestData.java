package payloads;

public class KeyAddRequestData {
	
		private String testName;
		private String key;
		private int expectedStatusCode;
		private String expectedStatus;
        private long maxResponseTime;
        private boolean validateSchema;

      //Setters
      	public void setTestName(String testName) {
      		    this.testName = testName;
      		}

      	public void setKey(String key) {
      		    this.key = key;
      		}

      	public void setExpectedStatusCode(int expectedStatusCode) {
      		    this.expectedStatusCode = expectedStatusCode;
      		}

      	public void setExpectedStatus(String expectedStatus) {
      		    this.expectedStatus = expectedStatus;
      		}
        
	//Getter
		public String getTestName() {
			return testName;
		}
		public String getKey() {
			return key;
		}
		public int getExpectedStatusCode() {
			return expectedStatusCode;
			
		}
		public String getExpectedStatus() {
			return expectedStatus;
		}

		public long getMaxResponseTime() {
			return maxResponseTime;
		}
		public boolean isValidateSchema() {
			return validateSchema;
		}
		
		
		
	}

