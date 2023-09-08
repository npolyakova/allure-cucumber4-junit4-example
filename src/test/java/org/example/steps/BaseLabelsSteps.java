package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class BaseLabelsSteps {

    private int a;
    private int b;
    private int c;

    @Given("^a is (\\d+)$")
    public void a_is(int arg1) {
        this.a = arg1;
    }

    @Given("^b is (\\d+)$")
    public void b_is(int arg1) {
        this.b = arg1;
    }

    @When("^I add a to b$")
    public void i_add_a_to_b() {
        this.c = this.a + this.b;
    }

    @Then("^result is (\\d+)$")
    public void result_is(int arg1) {
        if (this.c != arg1) {
            Assertions.fail("expecting %d to be equal to %d", this.c, arg1);
        }
    }

}
