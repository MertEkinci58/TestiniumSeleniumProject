package com.example.pages;

import com.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver){
        super(driver);
    }

    public BasketPage addProductToBasket(){
        click(By.id("add-to-basket"));
        System.out.println("Product Added To Basket");
        return this;
    }

    public BasketPage goToBasket(){
        click(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a"));
        System.out.println("Basket Page Opened");
        return this;
    }

    public BasketPage increaseProductCountOne(){
        click(By.xpath("//span[@class='plus icon-plus gg-icon gg-icon-plus']"));
        System.out.println("Number Of Products Increased By One");
        return this;
    }

    public BasketPage deleteProductFromBasket(){
        click(By.cssSelector("[title^='Sil']"));
        System.out.println("Product Deleted From Basket");
        return this;
    }

}
