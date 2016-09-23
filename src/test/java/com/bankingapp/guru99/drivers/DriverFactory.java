package com.bankingapp.guru99.drivers;

import com.bankingapp.guru99.util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by kotche on 23/09/2016.
 */
public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory(){
        initialize();
    }

    public void initialize() {
        if(driver == null){
            createNewDriverInstance();
        }
    }

    private void createNewDriverInstance() {

        String browser = new PropertyReader().readProperty("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
        }
        else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("ie")){
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void destroyDriver(){
        driver.quit();
        driver = null;
    }
}
