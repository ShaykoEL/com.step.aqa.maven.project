package by.step.amakids.tests.service;

import org.openqa.selenium.WebDriver;

public class BaseService {
    protected WebDriver driver;

    public BaseService (WebDriver driver) {
        this.driver = driver;

    }
}
