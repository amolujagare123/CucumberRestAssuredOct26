package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class UserRegistrationSD {

    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("I am on user registration page");
      }
    @When("I Enter Below data")
    public void i_enter_below_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        List<List<String>> data = dataTable.asLists();

        System.out.println("First name = "+data.get(0).get(0));
        System.out.println("Last name = "+data.get(0).get(1));
        System.out.println("Email = "+data.get(0).get(2));
        System.out.println("Contact = "+data.get(0).get(3));
        System.out.println("Address = "+data.get(0).get(4));
        System.out.println("City = "+data.get(0).get(5));
        System.out.println("State = "+data.get(0).get(6));
        System.out.println("Zip = "+data.get(0).get(7));
        System.out.println("Country = "+data.get(0).get(8));
        System.out.println("Password = "+data.get(0).get(9));


    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I am on user registration page");
    }
    @Then("User should be added")
    public void user_should_be_added() {
        System.out.println("User should be added");
     }
}
