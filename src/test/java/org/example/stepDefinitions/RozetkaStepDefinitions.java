package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pages.CategoryPage;
import pages.DriverProvider;

public class RozetkaStepDefinitions {
    CategoryPage categoryPage;

    @Given("I'm on the mobile phones category page")
    public void i_m_on_the_mobile_phones_category_page(){
        categoryPage = new CategoryPage();
    }

    @When("I enter {string} in 'I'm looking for..' field")
    public void i_enter_in_field(String searchWord) {
        categoryPage.typeValueIntoImLookingForField(searchWord);
        DriverProvider.INSTANCE.getDriver().manage().window().maximize();
    }

    @When("press on find button")
    public void press_on_button() {
        categoryPage.clickFindButton();
    }

    @Then("the category page with phones appears and each item contains {string}")
    public void the_category_page_with_phones_appears(String searchWorld) {
        for (WebElement item: categoryPage.getProducts()){
            Assert.assertTrue("Current search result NOT contain '"+searchWorld+"' in it's name",
                    item.getText().contains(searchWorld));
        }
    }
}
