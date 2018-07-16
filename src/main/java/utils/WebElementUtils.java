package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {

    public static void enterText(WebElement element, String text){
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static void hoverOnElement(WebDriver driver,WebElement element){

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }


    public static void waitforElementToLoad (WebDriver driver,WebElement element){

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
