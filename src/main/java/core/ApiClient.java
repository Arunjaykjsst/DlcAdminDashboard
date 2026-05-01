//Purpose:
//Used by: All services
package core;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.slf4j.Logger;

import io.qameta.allure.Allure;
import io.restassured.response.Response;
import utils.AllureUtils;
import utils.LoggerUtil;

public class ApiClient {

	private static final Logger log = LoggerUtil.getLogger(ApiClient.class);

	public static Response post(String endpoint, Map<String, String> queryParams, Object body) {

		AllureUtils.step("Sending POST Request");

		log.info("====== API REQUEST ======");
		log.info("Endpoint: {}", endpoint);
		log.info("Query Params: {}", queryParams);

		AllureUtils.attachRequest("Endpoint", endpoint);
		AllureUtils.attachRequest("Query Params", queryParams);
		AllureUtils.attachRequest("Request Body", body);

		Response response = given().log().all().queryParams(queryParams == null ? Map.of() : queryParams)
				.body(body == null ? "" : body).when().post(endpoint).then().log().all().extract().response();

//		RequestSpecification request = given(); // Start request
//		request.log().all(); // Log request
//
//		// Add query parameters safely
//		if (queryParams != null) {
//			request.queryParams(queryParams);
//		}
//
//		// Add body safely
//		if (body != null) {
//			request.body(body);
//		}
//
//		Response response = request.when().post(endpoint); // Send POST request
//		response.then().log().all(); // Log response

		AllureUtils.step("Recevide Response");
		log.info("====== API RESPONSE ======");
		AllureUtils.attachResponse(response.asPrettyString());

		log.info("Status Code: {}", response.getStatusCode());
		log.info("Response: {}", response.asPrettyString());

		Allure.addAttachment("API Response", response.asPrettyString());
		// Step 7: Return response
		return response;
	}
}