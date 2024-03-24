package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertNotEquals;

public class ProductPageStepDef {
    private final WebDriver driver = Hooks.driver;
    ProductPage productPage = new ProductPage(driver);
    LoginPage loginPage  = new LoginPage(driver);
    @Then("User will be redirected to product page")
    public void userWillBeRedirectedToProductPage() throws InterruptedException {
        Assert.assertTrue(productPage.verifyProductPage());
        Thread.sleep(1000);
    }

    @And("Product image should be displayed correctly")
    public void productImageShouldBeDisplayedCorrectly() {
        Assert.assertTrue(productPage.verifyProductImage());
    }

    @And("Product name should be displayed correctly")
    public void productNameShouldBeDisplayedCorrectly() {
        Assert.assertTrue(productPage.verifyProductName());
    }

    @And("Product price should be displayed correctly")
    public void productPriceShouldBeDisplayedCorrectly() {
        Assert.assertTrue(productPage.verifyProductPrice());
    }

    @And("Product description should be displayed correctly")
    public void productDescriptionShouldBeDisplayedCorrectly() {
        Assert.assertTrue(productPage.verifyProductDesc());
    }

    @When("User click on add to cart button")
    public void userClickOnAddToCartButton() throws InterruptedException {
        productPage.clickAddCartButton();
        Thread.sleep(2000);
    }

    @Then("Pop up {string} shouldn't appears")
    public void popUpShouldnTAppears(String alertText) {
        String expectedAlertText = loginPage.alertMessage();
        assertNotEquals(expectedAlertText, alertText);
    }
}
