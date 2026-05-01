package api;

import java.util.HashMap;
import java.util.Map;

import core.ApiClient;
import io.restassured.response.Response;
import routes.ApiRoutes;

public class MerchantKeyTransferApi {

	
	 public Response merchantKeyTransfer(String key, String merchantId, String type) {
		  Map<String, String > queryParams = new HashMap<>();
		  queryParams.put("key", key);
		  queryParams.put("merchantId", merchantId);
		  queryParams.put("type", type);
		  return ApiClient.post(ApiRoutes.MERCHANT_KEY_TRANSEFER, queryParams, null);
	 }
}
