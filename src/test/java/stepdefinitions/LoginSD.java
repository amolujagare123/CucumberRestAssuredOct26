package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {

   /* @Given("I am on login page")
    public void loginPage()
    {

    }*/

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password");
      }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
    }
    @Then("I should reach to home page")
    public void i_should_reach_to_home_page() {
        System.out.println("I should reach to home page");
       }


    @When("I enter incorrect username and password")
    public void i_enter_incorrect_username_and_password() {
        System.out.println("I enter incorrect username and password");
    }
    @Then("I should get an error")
    public void i_should_get_an_error() {
        System.out.println("I should get an error");
    }
    @When("I enter blank username and password")
    public void i_enter_blank_username_and_password() {
        System.out.println("I enter blank username and password");
        }

    @When("I enter username as {string} and password as {string}")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) {

        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Given("i open browser")
    public void iOpenBrowser() {
        System.out.println("i open browser");
    }

    @When("i maximize it")
    public void iMaximizeIt() {
        System.out.println("i maximize it");
    }
}
