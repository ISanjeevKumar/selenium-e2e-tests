package selenium.e2e.test.tests;

import org.testng.annotations.DataProvider;

import selenium.e2e.test.components.utils.JsonHelper;

public class TestDataProvider {
    
    @DataProvider(name = "userdata")
    public Object[][] getDataFromDataprovider() {
        return JsonHelper.getJsonDataIntoArray("src/test/resources/userdata.json");

    }
}
