package com.bankingapp.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

/**
 * Created by cheet_000 on 20-Sep-16.
 */

@Component
public class LoginPage{

    WebDriver driver;

    @FindBy(name="uid")
    WebElement userid;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="btnLogin")
    WebElement login;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterLoginDetails(String id, String pwd){
        userid.sendKeys(id);
        password.sendKeys(pwd);
    }

    public void submit(){
        login.click();
    }

    public void loginToBankingApp(String id, String pwd){
        enterLoginDetails(id, pwd);
        submit();
    }
    public boolean isCurrentPage(){
        return login.isDisplayed();
    }
}
