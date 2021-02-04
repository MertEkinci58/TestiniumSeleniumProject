package com.example.base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    static WebDriver webDriver = null;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Casper\\Desktop\\Test\\Testinium\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        /*options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");*/
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://gittigidiyor.com");
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }
    public static void setWebDriver(WebDriver webDriver){
        BaseTest.webDriver = webDriver;
    }
    public  void tearDown(){
        getWebDriver().quit();
    }
}
