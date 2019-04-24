package bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.DataTable;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class AccountStep implements En {

    public AccountStep() {
        Given("validate the browser", () -> {
            System.out.println("deciding the browser to open");
        });

        When("Browser is triggered", () -> {
            System.out.println("Browser is triggered");
        });

        Then("check if browser is started", () -> {
            System.out.println("Browser is started");
        });

        Given("User is on NetBanking landing page", () -> {
            //code to navigate to login url
            System.out.println("navigated to login url");
        });

        When("User login into application with {string} and password {string}", (String string, String string2) -> {
            System.out.println(string);
            System.out.println(string2);
            System.out.println("\n-------------------------------------");
        });

        Then("Home page is populated", () -> {
            //home page validation
            System.out.println("Validated home page");
        });

        Then("Cards displayed are (.+)", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println(string);
        });

        When("User sign up with following details", (io.cucumber.datatable.DataTable data) -> {
            // Write code here that turns the phrase above into concrete actions
            // For automatic transformation, change DataTable to one of
            // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
            // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
            // Double, Byte, Short, Long, BigInteger or BigDecimal.
            //
            // For other transformations you can register a DataTableType.

            List<List<String>>  dataList=data.asList(String.class);
            int firstName = 0, lastName = 1, email = 2 ,country = 3, password = 4;
            System.out.println(dataList.get(firstName));
            System.out.println(dataList.get(lastName));
            System.out.println(dataList.get(email));
            System.out.println(dataList.get(country));
            System.out.println(dataList.get(password));
        });

        When("^User login in to application with (.+) and password (.+)$", (String username, String password) -> {
            System.out.println();
            System.out.println(username);
            System.out.println(password);
            System.out.println("\n-------------------------------------\n");
        });
    }
}