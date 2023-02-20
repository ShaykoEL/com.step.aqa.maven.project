package by.step.amakids.tests.service;

import by.step.amakids.tests.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginService extends BaseService{

       private LoginPage loginPage = new LoginPage (driver);

    public LoginService(WebDriver driver) {

        super(driver);
    }
    public  LoginPage getLoginPage() {
      Logger logger = LoggerFactory.getLogger(LoginService.class);
      logger.info ("Hello from login page creator");

        return loginPage;
    }
}
