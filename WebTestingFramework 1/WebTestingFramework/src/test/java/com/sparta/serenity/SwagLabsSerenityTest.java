package com.sparta.serenity;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
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
public class SwagLabsSerenityTest {

    @Managed
    WebDriver driver;
    private static final String BASE_URL = "https://www.saucedemo.com/";

    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() {
        driver.get(BASE_URL);
        Assertions.assertEquals(BASE_URL, driver.getCurrentUrl());
        Assertions.assertEquals("Swag Labs", driver.getTitle());
    }
    @Test
    @DisplayName("Given I enter a valid username and password, when I click login, then I should land on the inventory page")
    public void succesfulLogingTest(){

        // Arrange (given)
        driver.get(BASE_URL);
        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        //Act (when)
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        assertThat(driver.getCurrentUrl(), is(BASE_URL + "inventory.html"));

    }

    @Test
    @DisplayName("Given I am logged in, when I view the inventory page, then I should see the correct number of products")
    public void checkNumberOfProductsOnInventoryPage(){
        driver.get(BASE_URL);
        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        // A list of all webelements where it has the class="inventory-item" attribute
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        for (WebElement w : products){
            System.out.println(w.getText());
        }

        int productCount = products.size();
        assertThat(productCount, is(6));

    }

    @Test
    @DisplayName("Given I enter a valid username and an invalid password, when I click login, then I should see an error message containing 'Epic sadface'")
    public void unsuccessfulLoginTest_InvalidPassword(){
        driver.get(BASE_URL);
        WebElement usernameField= driver.findElement(By.name("user-name"));
        WebElement passwordField= driver.findElement(By.name("password"));
        WebElement loginButton= driver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("invalid");
        loginButton.click();

        WebElement alert = driver.findElement(By.className("error-message-container"));
        MatcherAssert.assertThat(alert.getText(), containsString("Epic sadface"));
    }
   // Add a product to the cart and verify cart count
    @Test
    @DisplayName("Given I am logged in, when I add a product to the cart, then the cart count should increase")
    public void addProductToCartAndVerifyCount() {
        driver.get(BASE_URL);
        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        // A list of all webelements where it has the class="inventory-item" attribute
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));

       //String cartCount = shoppingCartBadge.getText();
        assertThat(cartBadge.getText(), is("1"));
    }

    @Test
    @DisplayName("Given I have a product in the cart, when I remove it, then the cart count should decrease accordingly")
    public void removeProductFromCart() {
        driver.get(BASE_URL);
        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

       // WebElement ShoppingCartButton = driver.findElement(By.className("shopping_cart_link"));
       // ShoppingCartButton.click();
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_link"));
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeButton.click();
        //String cartCount = shoppingCartBadge.getText();
        assertThat(cartBadge.getText(),is(""));

    }

    @Test
    @DisplayName("Given I am logged in, when I logout, then I should be redirected to the login page")
    public void logoutAndVerifyRedirection() {
        driver.get(BASE_URL);
        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        WebElement burger = driver.findElement(By.id("react-burger-menu-btn"));
        burger.click();
      WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
      logout.click();
      System.out.println("Current URL: " + driver.getCurrentUrl());
        assertThat(driver.getCurrentUrl(), is(BASE_URL ));

    }
}
