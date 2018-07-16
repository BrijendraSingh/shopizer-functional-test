package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import utils.Config;
import utils.DriverFactory;


public class AddBookToCartTest {

    public HomePage homePage;

    @BeforeTest(alwaysRun = true)
    public void setUp(){
        WebDriver driver=DriverFactory.getDriver();
        String baseUrl =Config.URL;
        driver.get(baseUrl);
        homePage= new HomePage();
    }

    @Test
    public void verifyCheckout()  {

        homePage.addBookToCart();
        Assert.assertEquals(homePage.checkCart(),"1 X THE BIG SWTCH","Book is not added to cart");
    }

    @AfterTest(enabled = true)
    public void tearDown(){
        DriverFactory.closeDriver();

    }

}
