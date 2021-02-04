package com.example.pages;

import com.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By EMAIL_AREA = By.id("L-UserNameField");
    public static final By PASSWORD_AREA = By.id("L-PasswordField");
    public static final By LOGIN_BUTTON = By.id("gg-login-enter");


    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    public LoginPage clickEmailField(){
        click(EMAIL_AREA);
        return this;
    }
//mertekinci1995@gmail.com
    public LoginPage sendEmail(){
        sendKeys(EMAIL_AREA, "mertekinci1995@gmail.com");
        return this;
    }

    public LoginPage clickPasswordField(){
        click(PASSWORD_AREA);
        return this;
    }

    public  LoginPage sendPassword(){
        sendKeys(PASSWORD_AREA, "Mert.2020");
        return this;
    }

    public LoginPage clickLogIn(){
        click(LOGIN_BUTTON);
        return this;
    }

    /*
    public LoginPage search(){
        sendKeys(SEARCH_AREA, "Bilgisayar");
        return this;
    }
    public LoginPage searchButton(){
        click(SEARCH_BUTTON);
        return this;
    }
*/

}
