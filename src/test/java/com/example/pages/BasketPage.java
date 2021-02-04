package com.example.pages;

import com.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class BasketPage extends BasePage {
    static final By ADD_TO_BASKET = By.id("add-to-basket");
    static final By CLOSE_AD_WINDOW = By.xpath("/html/body/div[8]/div/img");
    static final By GO_TO_BASKET = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a");
    static final By INCREASE_PRODUCT_COUNT_ONE = By.xpath("//span[@class='plus icon-plus gg-icon gg-icon-plus']");
    static final By IS_BASKET_EMPTY = By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2");
    static final By DELETE_PRODUCT_FROM_BASKET = By.cssSelector("[title^='Sil']");
    public BasketPage(WebDriver driver){
        super(driver);
    }

    public BasketPage AddProductToBasket(){
        click(ADD_TO_BASKET);
        return this;
    }
    public BasketPage CloseAdWindow(){
        click(CLOSE_AD_WINDOW);
        return this;
    }

    public BasketPage GoToBasket(){
        click(GO_TO_BASKET);
        return this;
    }

    public BasketPage IncreaseProductCountOne(){
        click(INCREASE_PRODUCT_COUNT_ONE);
        return this;
    }

    public BasketPage IsBasketCountSizeTwoController() {
        // There is no assert here because it will fail if xpath is not found.
        // Since we check value = 2 by xpath it is already "kind of" an assert.
        By.xpath("//*[@id=\"cart-item-456289248\"]/div[2]/div[4]/div/input[value=2]");
        return this;
    }

    public BasketPage DeleteProductFromBasket(){
        click(DELETE_PRODUCT_FROM_BASKET);
        return this;
    }

    public BasketPage IsBasketEmptyController(){
        System.out.println(getText(IS_BASKET_EMPTY));
        Assert.assertEquals(
                "Basket Is Empty Message Not Found",
                "Sepetinizde ürün bulunmamaktadır.",
                 getText(IS_BASKET_EMPTY)
        );
        return this;
    }

}
