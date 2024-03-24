package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartPageStepDef {
    private final WebDriver driver = Hooks.driver;
    CartPage cartPage  = new CartPage(driver);
    @When("User click on cart navigation")
    public void userClickOnCartNavigation() {
        cartPage.clickCartNavigation();
    }
    @Then("User should be redirected to cart page")
    public void userShouldBeRedirectedToCartPage() throws InterruptedException {
        Assert.assertTrue(cartPage.verifyCartPage());
        Thread.sleep(2000);
    }

    @And("Product image should be displayed correctly on cart")
    public void productImageShouldBeDisplayedCorrectlyOnCart() {
        Assert.assertTrue(cartPage.verifyImageProduct());
    }

    @And("Product title should be displayed correctly on cart")
    public void productTitleShouldBeDisplayedCorrectlyOnCart() {
        Assert.assertTrue(cartPage.verifyNameProduct());
    }

    @And("Product price should be displayed correctly on cart")
    public void productPriceShouldBeDisplayedCorrectlyOnCart() {
        Assert.assertTrue(cartPage.verifyPriceProduct());
    }

    @And("Product total price should be displayed correctly on cart")
    public void productTotalPriceShouldBeDisplayedCorrectlyOnCart() {
        Assert.assertTrue(cartPage.verifyTotalPriceProduct());
    }

    @When("User click delete button on product")
    public void userClickDeleteButtonOnProduct() {
        cartPage.clickDeleteButton();
    }

    @When("User click on place order button")
    public void userClickOnPlaceOrderButton() throws InterruptedException {
        cartPage.clickPlaceOrderButton();
        Thread.sleep(1500);
    }

    @And("User input {string} as name")
    public void userInputAsName(String name) {
        cartPage.inputNameField(name);
    }

    @And("User input {string} as country")
    public void userInputAsCountry(String country) {
        cartPage.inputCountryField(country);
    }

    @And("User input {string} as city")
    public void userInputAsCity(String city) {
        cartPage.inputCityField(city);
    }

    @And("User input {string} as credit card")
    public void userInputAsCreditCard(String creditCard) {
        cartPage.inputCreditCardField(creditCard);
    }

    @And("User input {string} as month")
    public void userInputAsMonth(String month) {
        cartPage.inputMonthField(month);
    }

    @And("User input {string} as year")
    public void userInputAsYear(String year) {
        cartPage.inputYearField(year);
    }


    @And("User click on purchase button")
    public void userClickOnPurchaseButton() {
        cartPage.clickPurchaseButton();
    }

    @Then("Thank you message for purchasing will showing")
    public void thankYouMessageForPurchasingWillShowing() {
        Assert.assertTrue(cartPage.verifyThankYouNotification());
    }

    @Then("Thank you message for purchasing shouldn't be showing")
    public void thankYouMessageForPurchasingShouldnTBeShowing() {
        Assert.assertFalse(cartPage.verifyThankYouNotification());
    }
}
