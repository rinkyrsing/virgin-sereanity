package com.virgingames.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GamesSteps {
    @When("^User sends a GET request$")
    public void userSendsAGETRequest() {
    }

    @And("^User must get back a valid status code (\\d+)$")
    public void userMustGetBackAValidStatusCode(int arg0) {
    }

    @Then("^User should verify 'defaultGameFrequency' value should be '(\\d+)'$")
    public void userShouldVerifyDefaultGameFrequencyValueShouldBe(int arg0) {
    }
}
