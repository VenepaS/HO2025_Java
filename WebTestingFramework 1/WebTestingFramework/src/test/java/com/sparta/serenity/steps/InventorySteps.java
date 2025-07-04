package com.sparta.serenity.steps;

import com.sparta.serenity.pages.HomePage;
import com.sparta.serenity.pages.InventoryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Feature;
import net.thucydides.core.annotations.Managed;

public class InventorySteps {
    @Managed
    HomePage homePage;
    InventoryPage inventoryPage;

    @Then("The number of products displayed on the inventory page is {int}")
    public void theNumberOfProductsDisplayedOnTheInventoryPageIs(String noItems ) {
        InventoryPage.noItemsOnPage(noItems);
           }

    @When("I add an item to the cart")
    public void iAddAnItemToTheCart() {
    }

    @Then("The item count increases by one")
    public void theItemCountIncreasesByOne() {
    }
}
