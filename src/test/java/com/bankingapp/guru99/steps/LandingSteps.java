package com.bankingapp.guru99.steps;

import com.bankingapp.guru99.drivers.DriverFactory;
import com.bankingapp.guru99.pages.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

/**
 * Created by kotche on 23/09/2016.
 */
public class LandingSteps extends DriverFactory{
    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
        Assert.assertTrue(new LandingPage(driver).isCurrentPage());
    }

    @When("^I would like to logout from banking app$")
    public void i_would_like_to_logout_from_banking_app() throws Throwable {
        new LandingPage(driver).logout();
    }

    @When("^accept the alert that is displayed$")
    public void accept_the_alert_that_displayed() throws Throwable {
            Alert alert = driver.switchTo().alert();
            alert.accept();
    }
}
