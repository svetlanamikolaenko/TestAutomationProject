package com.rozetka.pages;

import com.rozetka.AbstractPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProfilePage extends AbstractPage {

    @Override
    @Step("Open customers cabinet")
    public void openPage() {
        open("/cabinet/personal-information/");
    }

    @Step("Get customer email")
    public String getUserEmail() {
        return $(".cabinet-user__email").shouldBe(visible).getText();
    }
}
