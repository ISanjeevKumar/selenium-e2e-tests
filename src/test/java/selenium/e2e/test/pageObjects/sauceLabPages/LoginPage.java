package selenium.e2e.test.pageObjects.sauceLabPages;

import org.openqa.selenium.WebDriver;

import selenium.e2e.test.pageObjects.PageBase;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password){
    
        try {
            System.out.println(username + " " + password);
            
        } catch (Exception e) {
         
        }
    }
    
}
