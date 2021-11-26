package selenium.e2e.test.components.selenium;

import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.WebDriver;

import selenium.e2e.test.enums.Browser;

public class BrowserFactory {

    private Browser browser;

    public BrowserFactory(Browser browser) {
        this.browser = browser;
    }

    public WebDriver createBrowser() {
        WebDriver driver = null;
        switch (browser) {
        case CHROME:
            System.out.println("chrome");
            break;
        case EDGE:
            break;
        case FIREFOX:
            break;
        case INTERNET_EXPLORER:
            break;
        case SAFARI:
            break;
        default:
            throw new NotImplementedException("Given " + browser + " is not implemented");

        }
        return driver;
    }
}
