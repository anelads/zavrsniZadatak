package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static WebDriver driver;


    public static WebDriver getDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")){
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        return driver;

    }
}
