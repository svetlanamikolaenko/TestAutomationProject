package com.ct.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
    @FindBy(id = "auth_email")
    private WebElement emailField;

    @FindBy(id = "auth_pass")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'auth-modal__submit')]")
    private WebElement submitButton;

    protected HomePage homePage;

    public LoginPage(WebDriver driver) {
        super(driver);
        homePage = new HomePage(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {
        homePage.openLoginPage();
        waitElementUntilVisible(emailField);
    }
    @Step("Populate email")
    public LoginPage populateEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
        emailField.sendKeys(Keys.TAB);
        return this;
    }

    @Step("Populate password")
    public LoginPage populatePassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    @Step("Submit login")
    public LoginPage submit() {
        submitButton.click();
        submitButton.click();
        return this;
    }

    @Step("Login as user")
    public HomePage loginAs(String email, String password ){
        populateEmail(email);
        populatePassword(password);
        submit();
        return new HomePage(driver);
    }
}
