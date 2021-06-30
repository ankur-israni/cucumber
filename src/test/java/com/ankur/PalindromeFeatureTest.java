package com.ankur;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class PalindromeFeatureTest {

    private String input;
    private boolean isPalindrome;


    @Given("I entered string {string}")
    public void iEnteredString(String input) {
        this.input = input;
    }

    @When("I test it for Palindrome")
    public void iTestItForPalindrome() {
        isPalindrome = input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String result) {
        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }
    }

    @Given("I entered word {word}")
    public void iEnteredStringWord(String word) {
        input = word;
    }

    @Then("the output should be {string}")
    public void theOutputShouldBeResult(String output) {
        theResultShouldBe(output);
    }
}
