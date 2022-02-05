package com.ct.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    @FindBy (xpath = "//li[contains(@class,'user')]//button")
    private WebElement profileButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        driver.get(BASE_PAGE + "/");
    }

    @Step("Open Login page")
    public LoginPage openLoginPage(){
        waitElementUntilVisible(profileButton);
        profileButton.click();
        return new LoginPage(driver);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}

