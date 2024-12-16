package StepDefinition;
import Pages.SigninFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SigninFunctions {
    WebDriver driver;
    SigninFunction HomePage;
    @Given("Launch the chrome browser and enter the prepyAI url")
    public void launch_the_chrome_browser_and_enter_the_prepy_ai_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HomePage = new SigninFunction(driver);
        HomePage.launchUrl("https://anatomy.adraproductstudio.com/qabot");
    }
    @When("Then click on Sign in with Google")
    public void then_click_on_sign_in_with_google() {
        HomePage.clickSignInWithGoogle();
    }
    @When("Enter the valid email ID in the email field")
    public void enter_the_valid_email_id_in_the_email_field()
    {
        HomePage.enterEmail("dharshuu06092003@gmail.com");
    }
    @When("Click the Next button under email field")
    public void click_the_next_button_under_email_field() {
        HomePage.clickNextUnderEmail();
    }
    @When("Enter the valid password in the password field")
    public void enter_the_valid_password_in_the_password_field() {
        HomePage.enterPassword("Dharsini@06");
    }
    @When("Click the next button under password field")
    public void click_the_next_button_under_password_field() {
        HomePage.clickNextUnderPassword();
    }
    @Then("The user logged in to the prepyAI")
    public void the_user_logged_in_to_the_prepy_ai() {
        HomePage.verifyLogin();
        driver.close();
    }
}
