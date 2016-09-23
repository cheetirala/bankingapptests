package com.bankingapp.guru99.steps;

import com.bankingapp.guru99.drivers.DriverFactory;
import com.bankingapp.guru99.pages.LandingPage;
import com.bankingapp.guru99.pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by cheet_000 on 20-Sep-16.
 */
public class LoginSteps extends DriverFactory{

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private LandingPage landingPage;

    private WebDriver driver;

    @Before
    public void beforeScenario(){
        driver = new DriverFactory().getDriver();
    }

    @After
    public void afterScenario(){
        new DriverFactory().destroyDriver();
    }

    @Given("^I navigate to banking app$")
    public void i_navigate_to_banking_app() throws Throwable {
        driver.get("http://www.demo.guru99.com/V4/");
    }

    @When("^I enter my valid userid and password$")
    public void i_enter_my_valid_userid_and_password() throws Throwable {
        new LoginPage(driver).enterLoginDetails("mngr49609", "urAsuve");
    }

    @When("^I try to login to the banking app$")
    public void i_try_to_login_to_the_banking_app() throws Throwable {
        new LoginPage(driver).submit();
    }

    @Then("^I should be logged out successfully$")
    public void i_should_be_logged_out_successfully() throws Throwable {
        Assert.assertTrue(new LoginPage(driver).isCurrentPage());
    }
}
