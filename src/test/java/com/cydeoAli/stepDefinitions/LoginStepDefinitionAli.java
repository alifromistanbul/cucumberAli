package com.cydeoAli.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionAli {


    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        System.out.println("user is on the homepage");
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        System.out.println("user entered valid username");
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        System.out.println("user entered valid password");
    }

    @Then("user logs in the web page")
    public void user_logs_in_the_web_page() {
        System.out.println("user entered the web page");
    }

    @When("librarian is on the homepage")
    public void librarian_is_on_the_homepage() {
        System.out.println("librarian is on the home page");
    }

    @When("librarian enters valid username")
    public void librarian_enters_valid_username() {
        System.out.println("librarian entered valid username");
    }

    @Then("librarian enters valid password")
    public void librarian_enters_valid_password() {
        System.out.println("librarian entered valid password");
    }

    @Then("librarian logs in the dashboard page")
    public void librarian_logs_in_the_dashboard_page() {
        System.out.println("librarian logged in dashboard");
    }



}
