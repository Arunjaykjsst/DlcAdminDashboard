package dataprovider;

import java.util.List;

import org.testng.annotations.DataProvider;

import payloads.DeviceListRequestData;
import utils.JsonReader;

public class DeviceListDataProvider {
	@DataProvider(name = "deviceListData")
	public Object[][] getData(){
		
		List<DeviceListRequestData> dataList = JsonReader.readJsonListFromResources(
				"deviceListTestData.json", 
				DeviceListRequestData[].class);
		
		System.out.println("Loaded Test Data: " + dataList.size());
		
		Object[][] result = new Object[dataList.size()][1];

		for (int i = 0; i < dataList.size(); i++) {
	        result[i][0] = dataList.get(i);
	    }
		return result;
	}
		
}
