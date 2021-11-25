package selenium.e2e.test.tests.smoke;

import org.testng.annotations.Test;

import selenium.e2e.test.tests.TestBase;

public class LoginTest extends TestBase {

    @Test(description = "Check user should not be able to login with invalid password")
    public void shouldNotBeAbleToLoginWithInvalidCredentials() {
        try {
            System.out.println("Login test");
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
