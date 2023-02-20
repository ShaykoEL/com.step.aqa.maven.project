package java.by.step.amakids.tests.login_page_tests;

import by.step.amakids.tests.service.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.by.step.amakids.tests.base.BaseUITestsClass;
import java.time.Duration;

public class LoginPageTest extends BaseUITestsClass {

    @BeforeEach
    public void openLoginPage () throws InterruptedException {
        driver.navigate().to("https://logbook.itstep.org/");
        Thread.sleep(5000);
    }

    @Test
    public void verifyLoginInputVisibility () {
        //Given
        String initialWrongLoginString = "qwerty";
        String initialPassword = "12345";
        String expectedErrormessage = "User not found";
        LoginService = new LoginService(driver);
        LoginService.getLoginPage().getLoginBlock().loginField.sendKeys(initialWrongLoginString);
        LoginService.getLoginPage().getLoginBlock().passwordField.sendKeys(initialPassword);

        //When
        LoginService.getLoginPage().getLoginBlock().loginButton.click();

        //Then
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginService.getLoginPage().getLoginBlock().errorMessageBy));

        String actualErrorMessageText = LoginService.getLoginPage().getLoginBlock().errorMessage.getText();
        Assertions.assertEquals(expectedErrormessage, actualErrorMessageText);

    }
}
