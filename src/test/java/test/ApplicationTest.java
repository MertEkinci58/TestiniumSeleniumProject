package test;
import com.example.base.BaseTest;
import com.example.pages.HomePage;
import com.example.pages.LoginPage;
import com.example.pages.ProductPage;
import com.example.pages.BasketPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductPage productPage;
    BasketPage basketPage;

    @Before
    public void before(){
        homePage = new HomePage(getWebDriver());
        loginPage = new LoginPage(getWebDriver());
        productPage = new ProductPage(getWebDriver());
        basketPage = new BasketPage(getWebDriver());
    }

    @Test
    public void test(){
        homePage.CheckIfHomePageIsOpened()
                .HoverToLogin()
                .ClickLoginButton();

        loginPage.ClickEmailField()
                .SendEmail()
                .ClickPasswordField()
                .SendPassword()
                .ClickLogIn()
                .CheckIfLoggedIn();

        productPage.ClickSearchField()
                .FillSearchField()
                .ClickFindProduct()
                .ClosePolicyAlert()
                .ClickSecondPage()
                .CheckPageOpened()
                .ClickRandomProduct()
                .SelectProductDetailPrice()
                .ProductPriceCompare();

        basketPage.CloseAdWindow()
                .AddProductToBasket()
                .GoToBasket()
                .IncreaseProductCountOne()
                .IsBasketCountSizeTwoController()
                .DeleteProductFromBasket()
                .IsBasketEmptyController();
    }

    @After
    public void after(){
        getWebDriver().quit();
    }

}
