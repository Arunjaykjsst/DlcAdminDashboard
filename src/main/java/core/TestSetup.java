//What it contains:
//Base URL setup 
//Common headers
//Authentication setup
// Used By: RestClient
package core;

import io.restassured.RestAssured;
import utils.ConfigReader;

public class TestSetup {

	public static void setup() {
		RestAssured.baseURI = ConfigReader.get("baseUrl");
	}
}