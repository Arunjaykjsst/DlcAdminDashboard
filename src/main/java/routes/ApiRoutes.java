
//Purpose:
//Store all API URLs in one place
package routes;

import utils.ConfigReader;

public class ApiRoutes {

	public static final String BASE_URL = ConfigReader.get("baseUrl");

	public static final String KEY_ADD = BASE_URL + "/admin/adminController/keyAdd";

	public static final String KEY_REPORT = BASE_URL + "/admin/adminController/keyReport";

	public static final String MERCHANT_KEY_TRANSEFER = BASE_URL + "/admin/keyTransfer/merchantKeytransfer";

	public static final String MERCHANT_LEDGER = BASE_URL + "/admin/keyTransfer/merchantLedger";

	public static final String DEVICE_LIST = BASE_URL + "/admin/dlc/deviceList";

	public static final String DASHBOARD = BASE_URL + "/admin/findAllDashboardDetails";

}