package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebElementUtils.*;


public class HomePage extends BasePage{


    @FindBy(xpath = "//a[@href='#']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//a[@productid='6']")
    private WebElement addtoCart;

    @FindBy(xpath= "//div[@class='cart-content']//a[1]")
    private WebElement cartContent;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void addBookToCart(){

        addtoCart.click();
    }

    public String checkCart() {

        hoverOnElement(driver,shoppingCart);
        waitforElementToLoad(driver,cartContent);
        return cartContent.getText();
    }
}
