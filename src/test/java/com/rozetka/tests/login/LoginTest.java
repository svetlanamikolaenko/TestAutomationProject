package com.rozetka.tests.login;

import com.rozetka.components.LoginPopup;
import com.rozetka.enums.Customers;
import com.rozetka.models.Customer;
import com.rozetka.pages.HomePage;
import com.rozetka.pages.ProfilePage;
import com.rozetka.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPopup loginPopup;
    ProfilePage profilePage;
    Customer customer;

    @BeforeMethod
    public void setUp() {
        customer = Customers.TEST_USER.getCustomer();
        homePage = new HomePage();
        loginPopup = new LoginPopup();
        profilePage = new ProfilePage();
        homePage.openPage();
    }

    @Test
    public void verifyLoginTest() {
        homePage.openLoginPopup();
        loginPopup.loginAs(customer);
        profilePage.openPage();
        String actualUserEmail = profilePage.getUserEmail();
        Assert.assertEquals(actualUserEmail, customer.getEmail());
    }
}
