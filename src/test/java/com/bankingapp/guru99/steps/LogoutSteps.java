package com.bankingapp.guru99.steps;

import com.bankingapp.guru99.drivers.DriverFactory;
import com.bankingapp.guru99.pages.LandingPage;
import com.bankingapp.guru99.pages.LoginPage;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kotche on 22/09/2016.
 */
public class LogoutSteps extends DriverFactory{

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private LandingPage landingPage;

    @Given("^logged into banking app$")
    public void logged_into_banking_app() throws Throwable {
        new LoginPage(driver).loginToBankingApp("mngr49609", "urAsuve");
    }
}
