package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Login
{
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable
    {
        System.out.println("When user is on landing page");

    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String Arg1, String Arg2) throws Throwable
    {
        System.out.println(Arg1);
        System.out.println(Arg2);

    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable
    {
        System.out.println("When user is populated page");

    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String Arg1) throws Throwable
    {
        System.out.println(Arg1);

    }


    @When("User sign up with following details")
    public void user_Sign_Up_With_Following_Details(DataTable data)
    {
        List<List<String> > obj=data.asLists();
        ///first get(0)for 0th row and second get(0) for 0th column
        System.out.println(obj.get(0).get(0));///first get(0)for 0th row and second get(0) for 0th colum
        System.out.println(obj.get(0).get(1));////get(1) for second column
        System.out.println(obj.get(0).get(2));////get(1) for second column
        System.out.println(obj.get(0).get(3));

    }


    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable
    {
        System.out.println(username);
        System.out.println(password);
    }

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable
    {
        System.out.println("User validate the browsers");

    }

    @When("^browser is triggerd$")
    public void browser_is_triggerd() throws Throwable
    {
        System.out.println("User triggering the browser");

    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable
    {
        System.out.println("Browsers started.....");

    }


}
