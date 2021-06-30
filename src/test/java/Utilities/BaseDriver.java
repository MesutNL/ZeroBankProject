package Utilities;

import Pages.Parent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {


    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {


            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void Driverquit() {
        //wait
        Parent.delay(5);
        if (driver != null) {
            driver.quit();
            driver = null;

        }


    }
}
