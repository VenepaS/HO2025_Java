package com.sparta.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/inventory.html")

public class InventoryPage extends PageObject {

 InventoryPage inventoryPage;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElementFacade addToCartButton;

     @FindBy(className = "inventory_item")
    private WebElementFacade  noItems ;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElementFacade removeButton;


   // @FindBy(className = "shopping_cart_badge")
   // private WebElementFacade CartBadge;

    @FindBy(className = "shopping_cart_link")
     private WebElementFacade CartBadge;

    public void clickAddToCartButton() {
        addToCartButton.click();
    }
    public String checkCartBadge() {
       return CartBadge.getText();
    }

    public void clickRemoveButton() {
        removeButton.click();
    }

    public void   noItemsOnPage(String noItems) {
        noItems.repeat(6);
    }


}
