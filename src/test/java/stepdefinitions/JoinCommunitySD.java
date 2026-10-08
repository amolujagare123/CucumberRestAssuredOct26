package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JoinCommunitySD {

    @Given("I am on Join community page")
    public void i_am_on_join_community_page() {
        System.out.println("I am on Join community page");
    }

    @When("I click on submit button for Join community page")
    public void i_click_on_submit_button_for_join_community_page() {

        System.out.println("I click on submit button for Join community page");
    }
    @Then("user should be joined")
    public void user_should_be_joined() {
        System.out.println("user should be joined");
    }

    @When("I enter {} , {} , {} , {}")
    public void iEnterNameEmailContactCity(String name,String email,String contact,String city) {


        System.out.println("Name="+name);
        System.out.println("Email="+email);
        System.out.println("Contact="+contact);
        System.out.println("City="+city);

    }
}
