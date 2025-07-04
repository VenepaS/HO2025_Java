package com.sparta.serenity.tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import com.sparta.serenity.pages.*;

import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class SwagLabTests {
    @Managed
   // WebDriver driver;
    HomePage homePage;
InventoryPage inventoryPage;

    @Test
    @DisplayName("Given I enter a valid username and password, when I click login, then I should land on the inventory page")
    public void succesfulLogingTest(){

        // Arrange (given)
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();
        assertThat(homePage.getDriver().getCurrentUrl(), is("https://www.saucedemo.com/inventory.html"));

    }


    @Test
    @DisplayName("Given I am logged in, when I view the inventory page, then I should see the correct number of products")
    public void checkNumberOfProductsOnInventoryPage(){
       homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();

        // A list of all webelements where it has the class="inventory-item" attribute
        List<WebElement> products = homePage.getDriver().findElements(By.className("inventory_item"));
        for (WebElement w : products){
            System.out.println(w.getText());
        }

        int productCount = products.size();
        assertThat(productCount, is(6));

    }
    @Test
    @DisplayName("Given I enter a valid username and an invalid password, when I click login, then I should see an error message containing 'Epic sadface'")
    public void unsuccessfulLoginTest_InvalidPassword(){
        homePage .open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("invalid");
        homePage.clickLoginButton();
        MatcherAssert.assertThat(homePage.getErrorMessage(), containsString("Epic sadface"));
    }

    @Test
    @DisplayName("Given I enter a valid username and an invalid password, when I click login, then I should see an error message containing 'Epic sadface'")
    public void addProductToCartAndVerifyCount() {
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();
        inventoryPage.clickAddToCartButton();
        MatcherAssert.assertThat(inventoryPage.checkCartBadge(), containsString("1"));


    }

    @Test
    @DisplayName("Given I enter a valid username and an invalid password, when I click login, then I should see an error message containing 'Epic sadface'")
    public void removeProductFromCart() {
        homePage.open();
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickLoginButton();
        inventoryPage.clickAddToCartButton();
        MatcherAssert.assertThat(inventoryPage.checkCartBadge(), containsString("1"));
        inventoryPage.clickRemoveButton();
        MatcherAssert.assertThat(inventoryPage.checkCartBadge(), containsString(""));


    }

}
