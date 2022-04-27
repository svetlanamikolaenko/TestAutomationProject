package com.rozetka.components;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPopup {

    public LoginPopup fillLogin() {
        $("#auth_email").shouldBe(visible).val("");
        return this;
    }

    public LoginPopup fillPassword() {
        $("#auth_path").shouldBe(visible).val("");
        return this;
    }

    public void clickOnLogin() {
        $("[class*='auth-modal__submit']").shouldBe(visible).click();
        sleep(10000);
        $("[class*='auth-modal__submit']").click();
    }
}
