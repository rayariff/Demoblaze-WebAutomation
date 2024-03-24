package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.SignupPage;
import org.openqa.selenium.WebDriver;

public class SignupStepDef {
    private final WebDriver driver = Hooks.driver;
    SignupPage signupPage  = new SignupPage(driver);
    @When("User click sign up in navigation")
    public void userClickSignUpInNavigation() throws InterruptedException {
        signupPage.clickSignupNavigation();
        Thread.sleep(1000);
    }

    @And("User input {string} as username in sign up page")
    public void userInputAsUsernameInSignUp(String username) {
        signupPage.inputUsernameField(username);
    }

    @And("User input {string} as password in sign up page")
    public void userInputAsPasswordInSignUp(String password) {
        signupPage.inputPasswordField(password);
    }

    @And("User click sign up button")
    public void userClickSignUpButton() throws InterruptedException {
        signupPage.clickSignupButton();
        Thread.sleep(2000);
    }
}
