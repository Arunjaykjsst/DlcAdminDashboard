package dataprovider;

import java.util.List;

import org.testng.annotations.DataProvider;

import payloads.KeyAddRequestData;
import utils.JsonReader;

public class KeyAddTestDataProvider {

	@DataProvider(name = "keyAddData")
	public Object[][] getData() {

		List<KeyAddRequestData> dataList = JsonReader.readJsonListFromResources("KeyAddTestData.json",
				KeyAddRequestData[].class);

		System.out.println("Loaded Test Data : " + dataList.size());

		Object[][] result = new Object[dataList.size()][1];

		for (int i = 0; i < dataList.size(); i++) {
			result[i][0] = dataList.get(i);
		}
		return result;
	}
}
