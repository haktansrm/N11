package testcaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.BasePage;

public class SingInFunction extends BasePage {
    public SingInFunction(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);
    private By firstName= By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("registrationEmail");
    private By password = By.id("registrationPassword");
    private By passwordAgain = By.id("passwordAgain");
    private By phoneNumber = By.id("phoneNumber");
    private String pass ="123456";
    private By gender = By.id("genderMale");
    private By birthDay = By.cssSelector("#birthDay");
    private By birthMonth = By.cssSelector("#birthMonth");
    private By brithYear = By.cssSelector("#birthYear");
    private By acceptContract = By.cssSelector("#acceptContract");
    private By getTexttt = By.linkText("//www.n11.com/captcha/1.png?sessionId=63e831dc-7d9a-4018-97e5-a67765a572b334a96a99-4e08-497b-8dcc-d0a46d0bd228&key=1629039578076");
    public void signInForm() throws InterruptedException {
        element(By.linkText("Üye Ol")).click();
        sendKeys(firstName,"test");
        sendKeys(lastName,"testbir");
        sendKeys(email,"test@test.com");
        sendKeys(password,pass);
        sendKeys(passwordAgain,pass);
        element(phoneNumber).click();
        sendKeys(phoneNumber,"545736999");
        Thread.sleep(2000);
        //element(gender).click();
        actions.moveToElement(element(gender)).click().perform();
        Thread.sleep(2000);
        selectElement(element(birthDay),"2");
        Thread.sleep(2000);
        selectElement(element(birthMonth),"5");
        Thread.sleep(2000);
        selectElement(element(brithYear),"1996");
        Thread.sleep(2000);
        actions.moveToElement(element(acceptContract)).click().perform();
        System.out.println(element(getTexttt).getText());




    }


}
