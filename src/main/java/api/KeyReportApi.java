package api;

import java.util.HashMap;
import java.util.Map;

import core.ApiClient;
import io.restassured.response.Response;
import routes.ApiRoutes;

public class KeyReportApi {

	public Response addReport(String testName, String fromDate, String toDate, String trxnType, String transferType,
			String type, int pageNo, int pageSize) {

		// Querry Params
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("testName", String.valueOf(testName));
		queryParams.put("fromDate", String.valueOf(fromDate));
		queryParams.put("toDate", String.valueOf(toDate));
		queryParams.put("trxnType", String.valueOf(trxnType));
		queryParams.put("transferType", String.valueOf(transferType));
		queryParams.put("type", String.valueOf(type));
		queryParams.put("pageNo", String.valueOf(pageNo));
		queryParams.put("pageSize", String.valueOf(pageSize));

		return ApiClient.post(ApiRoutes.KEY_REPORT, queryParams, null);
	}
}
