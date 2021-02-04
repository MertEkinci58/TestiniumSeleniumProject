package com.example.pages;

import com.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    static final By EMAIL_AREA = By.id("L-UserNameField");
    static final By PASSWORD_AREA = By.id("L-PasswordField");
    static final By LOGIN_BUTTON = By.id("gg-login-enter");

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public LoginPage ClickEmailField(){
        click(EMAIL_AREA);
        return this;
    }

    public LoginPage SendEmail(){
        sendKeys(EMAIL_AREA, "alex_mert_fb@hotmail.com");
        return this;
    }

    public LoginPage ClickPasswordField(){
        click(PASSWORD_AREA);
        return this;
    }

    public  LoginPage SendPassword(){
        sendKeys(PASSWORD_AREA, "Mert.2020");
        return this;
    }

    public LoginPage ClickLogIn(){
        click(LOGIN_BUTTON);
        return this;
    }

    public LoginPage CheckIfLoggedIn(){
        // There is no assert here because it will fail if xpath is not found.
        // Since we check value = 2 by xpath it is already "kind of" an assert.
        By.cssSelector("[title^='Hesabım']");
        return this;
    }

}