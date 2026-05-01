
package api;

import io.restassured.response.Response;
import routes.ApiRoutes;

import java.util.HashMap;
import java.util.Map;

import core.ApiClient;

public class KeyAddApi {

    public Response addKey(String key) {

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("key", key);
             
        return ApiClient.post(ApiRoutes.KEY_ADD, queryParams, null);// Pass complete URL and Keys to 
    }
}