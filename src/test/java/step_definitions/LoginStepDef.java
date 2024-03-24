package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage  = new LoginPage(driver);
    HomePage homePage  = new HomePage(driver);

    @Given("User already on home page")
    public void userAlreadyOnHomePage() throws InterruptedException {
        Assert.assertTrue(homePage.verifyCarouselImage());
        Thread.sleep(1000);
    }

    @When("User click login in navigation")
    public void userClickLoginInNavigation() throws InterruptedException {
        loginPage.clickLoginNavigation();
        Thread.sleep(1000);
    }

    @And("User input {string} as username in login page")
    public void userInputAsUsername(String username) {
        loginPage.inputUsernameField(username);
    }

    @And("User input {string} as password in login page")
    public void userInputAsPassword(String password) {
        loginPage.inputPasswordField(password);
    }

    @And("User click login button")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(2500);
    }

    @Then("Welcome user in navigation is shown")
    public void welcomeUserInNavigationIsShown() {
        Assert.assertTrue(loginPage.verifyWelcomeUser());

    }

    @Then("Pop up {string} will be shown")
    public void popUpWillBeShown(String alertText) {
        String expectedAlertText = loginPage.alertMessage();
        assertEquals(expectedAlertText, alertText);
    }
}
