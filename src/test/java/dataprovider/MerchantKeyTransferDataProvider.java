package dataprovider;

import java.util.List;

import org.testng.annotations.DataProvider;

import payloads.MerchantKeyTransferRequestData;
import utils.JsonReader;

public class MerchantKeyTransferDataProvider {

	
@DataProvider(name = "merchantKeyTransferData")
public Object[][] getData(){
	
	List<MerchantKeyTransferRequestData> dataList = JsonReader.readJsonListFromResources(
			"MerchantKeyTransferData.json", 
			MerchantKeyTransferRequestData[].class);
	
	System.out.println("Loaded Test Data: " + dataList.size());
	
	Object[][] result = new Object[dataList.size()][1];

	for (int i = 0; i < dataList.size(); i++) {
        result[i][0] = dataList.get(i);
    }
	return result;
}
	
	
}
