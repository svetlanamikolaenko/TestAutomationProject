package com.ct.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PersonalInfoPage extends AbstractPage{

    @FindBy(xpath = "//p[@class='cabinet-user__email']")
    private WebElement userEmail;

    public PersonalInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        driver.get(BASE_PAGE + "/cabinet/personal-information/");
    }

    @Step("Get user email in cabinet")
    public String getUserEmail(){
        wait.until(ExpectedConditions.visibilityOf(userEmail));
        return userEmail.getText();
    }
}
