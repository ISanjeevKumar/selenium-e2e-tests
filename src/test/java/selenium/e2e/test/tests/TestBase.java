package selenium.e2e.test.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    @BeforeTest(alwaysRun = true)
    public void testInitialization() {
        System.out.println("Before Tests");
    }

    @AfterTest
    public void testCleanup() {
        System.out.println("After Tests");
    }
}
