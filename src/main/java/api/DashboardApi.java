package api;

import core.ApiClient;
import io.restassured.response.Response;
import routes.ApiRoutes;

public class DashboardApi {

	
	public Response dashboard() {
		return ApiClient.post(ApiRoutes.DASHBOARD, null, null);
	}
}
