package dataprovider;

import java.util.List;

import org.testng.annotations.DataProvider;

import payloads.MerchantLedgerData;
import utils.JsonReader;

public class MerchantLedgerDataProvider {
	@DataProvider(name = "merchantLedgerData")
	public Object[][] getData(){
		
		List<MerchantLedgerData> dataList = JsonReader.readJsonListFromResources(
				"merchantLedgerTestData.json", 
				MerchantLedgerData[].class);
		
		System.out.println("Loaded Test Data: " + dataList.size());
		
		Object[][] result = new Object[dataList.size()][1];

		for (int i = 0; i < dataList.size(); i++) {
	        result[i][0] = dataList.get(i);
	    }
		return result;
	}
		
		
	}

