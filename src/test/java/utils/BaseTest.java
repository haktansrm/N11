package utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;
    public String baseUrl= "https://www.n11.com/";
    public Logger logger = LogManager.getLogger(getClass().getName());
}
