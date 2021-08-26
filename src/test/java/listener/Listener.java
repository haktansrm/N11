package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;
import utils.BaseTest;

import java.util.concurrent.TimeUnit;

public class Listener extends BaseTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);
        logger.info("Google Açıldı");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test başarılı");
        logger.info(" Başarılı");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("fail");
        logger.error(" fail");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("skip");
        logger.warn(" skip");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\siram\\work\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        logger.info("Browser Açıldı");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
        driver.manage().deleteAllCookies();



    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        //driver.quit();
        logger.info("Browser Kapatıldı");

    }
}
