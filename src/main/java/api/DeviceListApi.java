package api;

import java.util.HashMap;
import java.util.Map;

import core.ApiClient;
import io.restassured.response.Response;
import routes.ApiRoutes;

public class DeviceListApi {

	
	public Response deviceList(
			String fromDate, 
			String toDate, 
			String imei1,
			String merchantId, 
			String pageNo,
			String pageSize,
			String deviceId,
			String type,
			String status
		) {
		
		Map<String , String> queryParams = new HashMap<>();
		queryParams.put("fromDate", String.valueOf(fromDate));
		queryParams.put("toDate", String.valueOf(toDate));
		queryParams.put("imei1", String.valueOf(imei1));
		queryParams.put("merchantId", String.valueOf(merchantId));
		queryParams.put("pageNo", String.valueOf(pageNo));
		queryParams.put("pageSize", String.valueOf(pageSize));
		queryParams.put("deviceId", String.valueOf(deviceId));
		queryParams.put("type", String.valueOf(type));
		queryParams.put("status", String.valueOf(status));
		
	return ApiClient.post(ApiRoutes.DEVICE_LIST, queryParams, null)	;
		
	}
	
	
}
