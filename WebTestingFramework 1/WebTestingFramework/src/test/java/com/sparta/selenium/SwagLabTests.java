package com.sparta.selenium;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class SwagLabTests {
    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    private static final String BASE_URL = "https://www.saucedemo.com/";
    private WebDriver webDriver;
    private static ChromeDriverService service;

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //Options.assArguments("--headless")
        //implict wait is set once
      //  options.setImplicitWaitTimeout("--disable-gpu");
       // options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    @BeforeAll
    public static void beforeAll() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                .usingAnyFreePort()
                .build();
        service.start();
    }
    @AfterEach
    public void afterEach() {
        webDriver.quit();
    }
    @AfterAll
    static void afterAll() {
        service.stop();
    }

    @BeforeEach
    public void setup() {
        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
    }
    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() {
        webDriver.get(BASE_URL);
        Assertions.assertEquals(BASE_URL, webDriver.getCurrentUrl());
        Assertions.assertEquals("Swag Labs", webDriver.getTitle());
    }
    @Test
    @DisplayName("Given I enter a valid username and password, when I click login, then I should land on the inventory page")
    public void succesfulLogingTest(){

        //webDriver.findElement(ByClassName("box-1"));
        // Arrange (given)
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        //Act (when)
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        assertThat(webDriver.getCurrentUrl(), is(BASE_URL + "inventory.html"));

    }



    @Test
    @DisplayName("Given I am logged in, when I view the inventory page, then I should see the correct number of products")
    public void checkNumberOfProductsOnInventoryPage() {
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
//        WebElement products = webDriver.findElement(By.className("inventory-item"));

        // A list of all webelements where it has the class="inventory-item" attribute
        List<WebElement> products = webDriver.findElements(By.className("inventory_item"));
        for (WebElement w : products) {
            System.out.println(w.getText());
//            int productCount = products.size();
//            assertThat(productCount, is(6));
        }
        int productCount = products.size();
        assertThat(productCount, is(6));
    }

//Ecpltwait specify A specificcondition that must be true before continug with the next command
@Test
@DisplayName("Given I am logged in, when I view the inventory page, then I should see the correct number of products")
public void checkNumberOfProductsOnInventory() {
    webDriver.get(BASE_URL);
    WebElement usernameField = webDriver.findElement(By.name("user-name"));
    WebElement passwordField = webDriver.findElement(By.name("password"));
    WebElement loginButton = webDriver.findElement(By.id("login-button"));
    usernameField.sendKeys("standard_user");
    passwordField.sendKeys("secret_sauce");
    loginButton.click();
//        WebElement products = webDriver.findElement(By.className("inventory-item"));

    // A list of all webelements where it has the class="inventory-item" attribute

    List<WebElement> products = webDriver.findElements(By.className("inventory_item"));
    for (WebElement w : products) {
        System.out.println(w.getText());
//            int productCount = products.size();
//            assertThat(productCount, is(6));
    }
    int productCount = products.size();
    assertThat(productCount, is(6));
}
@Test
    public void logoutAndVerifyRedirection() {
        webDriver.get(BASE_URL);
        WebElement usernameField = webDriver.findElement(By.name("user-name"));
        WebElement passwordField = webDriver.findElement(By.name("password"));
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        WebElement burger = webDriver.findElement(By.id("react-burger-menu-btn"));
        burger.click();
        WebElement logout = webDriver.findElement(By.id("logout_sidebar_link"));
        logout.click();
    System.out.println("Current URL: " + webDriver.getCurrentUrl());
       // assertThat(webDriver.getCurrentUrl(), is(BASE_URL));
    }
}