package payloads;

public class MerchantLedgerData {
    private String testName;
	private String fromDate;
	private String toDate;
	private String merchantId;
    private String trxnType; 
	private String transferType;
	private String type;
	private String pageNo;
	private String pageSize;
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
	public String getMerchantId() {
		return merchantId;
	}
	public String getTrxnType() {
		return trxnType;
	}
	public String getTransferType() {
		return transferType;
	}
	public String getType() {
		return type;
	}
	public String getPageNo() {
		return pageNo;
	}
	public String getPageSize() {
		return pageSize;
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
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public void setTransactionType(String trxnType) {
		this.trxnType =trxnType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;	
	}
	public void setType(String type) {
		this.type =type;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
		
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		
	}

	
}
