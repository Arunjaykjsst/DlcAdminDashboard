package dataprovider;

import java.util.List;

import org.testng.annotations.DataProvider;

import payloads.DashboarRequestData;
import utils.JsonReader;

public class DashboardDataProvider {
	@DataProvider(name = "dashboardData")
	public Object[][] getData(){
		
		List<DashboarRequestData> dataList = JsonReader.readJsonListFromResources("dashboardTestData.json", DashboarRequestData[].class);
		
		System.out.println("Loaded Test Data: " + dataList.size());
		
		Object[][] result = new Object[dataList.size()][1];

		for (int i = 0; i < dataList.size(); i++) {
	        result[i][0] = dataList.get(i);
	    }
		return result;
	}
		
}

