package selenium.e2e.test.tests.smoke;

import org.testng.annotations.Test;

import selenium.e2e.test.enums.Browser;
import selenium.e2e.test.pageObjects.SauceLabApp;
import selenium.e2e.test.tests.TestBase;
import selenium.e2e.test.tests.TestDataProvider;

public class LoginTest extends TestBase {

    @Test(description = "Check user should not be able to login with invalid password", dataProvider = "userdata", dataProviderClass = TestDataProvider.class)
    public void shouldNotBeAbleToLoginWithInvalidCredentials(String username, String password) {
        try {
            System.out.println(username + ":" + password);
            SauceLabApp sauceLabApp = new SauceLabApp(Browser.CHROME);
            sauceLabApp.loginPage().login(username, password);

        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
    }

    @Test(description = "Check user should  be able to login with valid password")
    public void shouldBeAbleToLoginWithValidCredentials() {
        try {
            System.out.println("Login test 2");
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
    }

}
