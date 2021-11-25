package selenium.e2e.test.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void testInitialization() {
        System.out.println("Before Tests");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void testCleanup() {
        System.out.println("After Tests");
        driver.quit();
    }
}
