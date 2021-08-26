package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public BasePage(WebDriver driver){
        this.driver=driver;

    }
    protected WebDriver driver;



    public WebElement element(By locator){

        return driver.findElement(locator);
    }

    public void sendKeys(By locator, String value){
        element(locator).sendKeys(value);
    }

    public void selectElement(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);

    }
}
