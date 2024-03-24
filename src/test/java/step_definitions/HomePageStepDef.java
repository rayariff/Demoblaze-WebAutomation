package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageStepDef {
    private final WebDriver driver = Hooks.driver;
    HomePage homePage  = new HomePage(driver);
    @Then("User verify that carousel image is loaded correctly")
    public void userVerifyThatCarouselImageIsLoadedCorrectly() {
        homePage.verifyCarouselImage();
    }

    @When("User click next button beside carousel")
    public void userClickNextButtonBesideCarousel() {
        homePage.clickNextButtonCarousel();
    }

    @Then("Carousel image will be changed to next image")
    public void carouselImageWillBeChangedToNextImage() {
        Assert.assertTrue(homePage.verifyNextButtonCarousel());
    }

    @When("User click previous button beside carousel")
    public void userClickPreviousButtonBesideCarousel() {
        homePage.clickPrevButtonCarousel();
    }

    @Then("Carousel image will be changed to previous image")
    public void carouselImageWillBeChangedToPreviousImage() {
        Assert.assertTrue(homePage.verifyPrevButtonCarousel());
    }

    @When("User click Phone categories")
    public void userClickPhoneCategories() {
        homePage.clickPhoneCategories();
    }

    @Then("Displayed product is relevant to Phone categories")
    public void verifyThatDisplayedProductIsRelevantToPhoneCategories() {
        Assert.assertTrue(homePage.verifyRelevantItemPhone());
    }

    @And("Product image is shown correctly")
    public void productImageIsShownCorrectly() {
        Assert.assertTrue(homePage.verifyImageProductCard());
    }

    @And("Product name is shown correctly")
    public void productNameIsShownCorrectly() {
        Assert.assertTrue(homePage.verifyNameProductCard());
    }

    @And("Product price is shown correctly")
    public void productPriceIsShownCorrectly() {
        Assert.assertTrue(homePage.verifyPriceProductCard());
    }

    @And("Product description is shown correctly")
    public void productDescriptionIsShownCorrectly() {
        Assert.assertTrue(homePage.verifyDescProductCard());
    }

    @When("User click on one of the product card")
    public void userClickOnOneOfTheProductCard() {
        homePage.clickProductCard();
    }

    @When("User click on next product button")
    public void userClickOnNextProductButton() throws InterruptedException {
        homePage.clickNextProductButton();
        Thread.sleep(1000);
    }

    @Then("Next product should be displayed")
    public void nextProductShouldBeDisplayed() {
        Assert.assertTrue(homePage.verifyRelevantItemMonitor());
    }

    @When("User click on previous product button")
    public void userClickOnPreviousProductButton() throws InterruptedException {
        homePage.clickPrevProductButton();
        Thread.sleep(1000);
    }

    @Then("Previous product should be displayed")
    public void previousProductShouldBeDisplayed() {
        Assert.assertTrue(homePage.verifyRelevantItemPhone2());
    }

    @Then("Product should be only show relevant product in phone categories")
    public void productShouldBeOnlyShowRelevantProductInPhoneCategories() {
        Assert.assertFalse(homePage.verifyRelevantItemMonitor());
    }

    @When("User click monitor categories")
    public void userClickMonitorCategories() {
        homePage.clickMonitorCategories();
    }

    @Then("Product should be only show relevant product in monitor categories")
    public void productShouldBeOnlyShowRelevantProductInMonitorCategories() {
        Assert.assertFalse(homePage.verifyRelevantItemPhone2());
    }
}
