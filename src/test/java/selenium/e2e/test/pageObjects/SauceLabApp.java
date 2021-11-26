package selenium.e2e.test.pageObjects;

import org.openqa.selenium.WebDriver;

import selenium.e2e.test.components.selenium.BrowserFactory;
import selenium.e2e.test.enums.Browser;
import selenium.e2e.test.pageObjects.sauceLabPages.LoginPage;

public class SauceLabApp {

    private BrowserFactory browserFactory;
    private WebDriver driver;
    private LoginPage loginPage;

    public SauceLabApp(Browser browser) {
        browserFactory = new BrowserFactory(browser);
        driver = browserFactory.createBrowser();
    }

    public LoginPage loginPage() {
        if (loginPage == null)
            loginPage = new LoginPage(driver);
        return loginPage;

    }

}
