package by.step.amakids.tests.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock extends BaseBlock{

    public LoginBlock (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[contains(text(), 'Войти на платформу AMAkids')]//..//input[@name='login']")
    public WebElement loginField;


}

