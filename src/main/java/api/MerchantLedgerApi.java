package api;

import java.util.HashMap;
import java.util.Map;

import core.ApiClient;
import io.restassured.response.Response;
import routes.ApiRoutes;

public class MerchantLedgerApi {

	public Response merchantLedger(String fromDate, String toDate, String merchantId, String trxnType,
			String transferType, String type, String pageNo, String pageSize) {

		Map<String, String> queryParams = new HashMap<>();  // Store all queryParames.

		queryParams.put("fromDate", fromDate);
		queryParams.put("toDate", toDate);
		queryParams.put("merchantId", merchantId);
		queryParams.put("trxnType", trxnType);
		queryParams.put("transferType", transferType);
		queryParams.put("type", type);
		queryParams.put("pageNo", pageNo);
		queryParams.put("pageSize", pageSize);

		return ApiClient.post(ApiRoutes.MERCHANT_LEDGER, queryParams, null);
	}
}
