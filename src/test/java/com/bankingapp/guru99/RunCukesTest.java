package com.bankingapp.guru99;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by kotche on 22/09/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", format = {"pretty", "json:target/cucumber.json"}, tags={"~@ignore"})
public class RunCukesTest {
}
