package com.ct.tests.login;

import com.ct.framework.config.TestConfig;
import com.ct.framework.pages.HomePage;
import com.ct.framework.pages.LoginPage;
import com.ct.framework.pages.PersonalInfoPage;
import com.ct.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    PersonalInfoPage personalInfoPage;
    private final String EMAIL = TestConfig.CONFIG.userEmail();
    private final String PASSWORD = TestConfig.CONFIG.userPassword();

    @BeforeMethod
    void openMainPage(){
        homePage = new HomePage(driver);
        personalInfoPage = new PersonalInfoPage(driver);
    }

    @Test(priority = 1)
    public void openMainPageTest() {
     homePage.openPage();
     String actualTitle = homePage.getPageTitle();
     String expectedTitle = "Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине";

     assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 2)
    public void loginTest()  {
        homePage.openPage();
        loginPage = homePage.openLoginPage();
        loginPage.loginAs(EMAIL, PASSWORD);
        personalInfoPage.openPage();
        String actualEmail = personalInfoPage.getUserEmail();

        assertEquals(actualEmail, EMAIL);
    }
}


