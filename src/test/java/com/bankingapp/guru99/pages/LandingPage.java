package com.bankingapp.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by cheet_000 on 20-Sep-16.
 */
public class LandingPage {

    WebDriver driver;

    @FindBy(css=".menusubnav")
    WebElement menu;

    @FindBy(linkText = "Log out")
    WebElement logout;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logout(){
        logout.click();
    }

    public boolean isCurrentPage() {
        return menu.isDisplayed();
    }
}
