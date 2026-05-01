package dataprovider;

import java.util.List;

import org.testng.annotations.DataProvider;

import payloads.KeyReportRequestData;
import utils.JsonReader;

public class KeyReportDataProvider {

    @DataProvider(name = "keyReportData")
    public Object[][] getData() {

        List<KeyReportRequestData> dataList = JsonReader.readJsonListFromResources("KeyReportTestData.json", 
        		KeyReportRequestData[].class
        );

        Object[][] data = new Object[dataList.size()][1];

        for (int i = 0; i < dataList.size(); i++) {
            data[i][0] = dataList.get(i);
        }

        return data;
    }
}
 