package StepDefinition;
import Pages.Negative;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NegativeUrl {
    WebDriver driver;
    Negative negative;
    @Given("Launch the chrome browser")
    public void launch_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        negative = new Negative(driver);
    }
    @When("Enter the PrepyAI website invalid url")
    public void enter_the_prepy_ai_website_invalid_url() {
        negative.launchUrl("https://anatomy.adraproductstudio.com/");
    }
    @Then("The PrepyAI website should not open")
    public void the_prepy_ai_website_should_not_open() {
        negative.validateURL("https://anatomy.adraproductstudio.com/");
    }
}
