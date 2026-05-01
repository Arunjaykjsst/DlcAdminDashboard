package payloads;

public class DeviceListRequestData {
	   private String testName;
		private String fromDate;
		private String toDate;
		private String imei1;
		private String merchantId;
		private String pageNo;
		private String pageSize;
		private String type;
		private String status;
		private String deviceId;
		private int expectedStatusCode;
		private String expectedStatus;
		
		
		//Getter
		public String getTestName() {
			return testName;
		}
		public String getFromDate() {
			return fromDate;
		}
		public String getToDate() {
			return toDate;
		}
		public String getImei1() {
			return imei1;
		}
		public String getMerchantId() {
			return merchantId;
		}
		
		
		
		public String getPageNo() {
			return pageNo;
		}
		public String getPageSize() {
			return pageSize;
		}
		public String getDeviceId() {
			return deviceId;
		}
		public String getType() {
			return type;
		}
		public String getStatus() {
			return status;
		}
		public int getExpectedStatusCode() {
			 return expectedStatusCode;
		 }
		public String getExpectedStatus() {
			 return expectedStatus;
		 }
		 
		 
		//Setter
		public void setTestName(String testName) {
			this.testName = testName;
		}
		public void setFromDate(String fromDate) {
			this.fromDate = fromDate;		
		}
		public void setToDate(String toDate) {
			this.toDate = toDate;
		}
		public void setImei1(String imei1) {
			this.imei1=imei1;
		}
		public void setMerchantId(String merchantId) {
			this.merchantId = merchantId;
		}
		
		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
			
		}
		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
			
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;	
		}
		public void setType(String type) {
			this.type =type;
		}
		public void setStatus(String status) {
			this.status =status;
		}

}
