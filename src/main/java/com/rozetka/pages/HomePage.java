package com.rozetka.pages;
import com.rozetka.components.LoginPopup;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public void openLoginPopup(){
        $("[class*='user']").shouldBe(visible).click();
        new LoginPopup();
    }
}
