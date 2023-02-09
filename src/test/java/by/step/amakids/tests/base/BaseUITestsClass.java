
package java.by.step.amakids.tests.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUITestsClass {
    protected WebDriver driver;

    @BeforeAll
    public void prepareWebDriver () {
        System.setProperty("webdriver.chrome.driver", "/test/resources/chromedriver.exe");
        driver = new ChromeDriver ();

    }

    @AfterAll
    public void quitDriver () {
        driver.quit();
    }

}
