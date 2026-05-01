//Purpose:
//Define request body structure (POJO)
//Used in:
//POST / PUT APIs
//Benefit:
//Clean JSON handling (via Jackson)

package payloads;

public class KeyReportRequestData {

	private String testName;
	private String fromDate;
	private String toDate;
	private String trxnType;
	private String transferType;
	private String type;
	private int pageNo;
	private int pageSize;

	private int expectedStatusCode;
	private String expectedStatus;

	// Getters
	public String getTestName() {
		return testName;
	}

	public String getFromDate() {
		return fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public String getTrxnType() {
		return trxnType;
	}

	public String getTransferType() {
		return transferType;
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getPageSize() {
		return pageSize;
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

	// Setters
	public void setTestName(String testName) {
		this.testName = testName;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public void setTrxnType(String trxnType) {
		this.trxnType = trxnType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
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
}
