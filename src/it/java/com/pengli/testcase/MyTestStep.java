package com.pengli.testcase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;


public class MyTestStep  {

    @Autowired
    String message;

    @When("the client calls \\/version")
    public void the_client_calls_version() {
        System.out.println("pengli list: " + message);
    }

    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer int1) {
        System.out.println("pengli testcase");
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Then("the client receives server version {double}")
    public void the_client_receives_server_version(Double double1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

}
