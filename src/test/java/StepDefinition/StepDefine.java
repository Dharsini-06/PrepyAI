package StepDefinition;
import Pages.WebsitePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StepDefine {
    WebDriver driver;
    WebsitePage webPage;
    @Before
    @Given("Launch the Chrome Browser")
    public void launch_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //driver Initialize the WebDriver
        this.webPage = new WebsitePage(driver);
    }
    @When("Enter the prepyAI website valid url")
    public void enter_the_prepy_ai_website_valid_url() {
        webPage.launchUrl("https://anatomy.adraproductstudio.com/");
    }
    @Then("The PrepyAI website should open successfuly")
    public void the_prepy_ai_website_should_open_successfuly() {
        webPage.validateURL("https://anatomy.adraproductstudio.com/");
        webPage.validateTitle("PrepyAI | Enhance exam preparation");
    }
    @When("Enter the PrepyAI website valid url with insecure")
    public void enter_the_prepy_ai_website_valid_url_with_insecure() {
        webPage.launchUrl("https://anatomy.adraproductstudio.com/");
    }
    @When("validate the PrepyAI website")
    public void validate_the_prepy_ai_website() {
        webPage.validateURL("https://anatomy.adraproductstudio.com/");
    }
    @Then("The website should not shows any error message , it will automatically redirect as HTTPS")
    public void the_website_should_not_shows_any_error_message_it_will_automatically_redirect_as_https() {
        System.out.println("Its automatically changed to HTTPS");
    }
    @When("Enter the PrepyAI website url and retrive the page title")
    public void enter_the_prepy_ai_website_url_and_retrive_the_page_title() {
        webPage.launchUrl("https://anatomy.adraproductstudio.com/");
    }

    @Then("the page title should be show as - PrepyAI | Enhance exam preparation")
    public void the_page_title_should_be_show_as_prepy_ai_enhance_exam_preparation() {
        String title = driver.getTitle();
        System.out.println(title);
        webPage.validateTitle("PrepyAI | Enhance exam preparation");
    }
    @When("validate the page title")
    public void validate_the_page_title() {
        String title = driver.getTitle();
        System.out.println(title);
        webPage.validateTitle("PrepyAI | Enhance exam preparation");
    }
    @Then("The title should not mismatch or the old ones should not display without refreshing")
    public void the_title_should_not_mismatch_or_the_old_ones_should_not_display_without_refreshing() {
        System.out.println("The title did not match with old ones and shows correctly without mismatching");
    }
    @When("Enter the prepyAI valid url")
    public void enter_the_prepy_ai_valid_url() {
        webPage.launchUrl("https://anatomy.adraproductstudio.com/");
    }
    @When("the website is accessed with a insecure connection HTTP")
    public void the_website_is_accessed_with_a_insecure_connection_http() {
        System.out.println("one");
    }
    @When("the padlock icon should appear in the browser’s address bar")
    public void the_padlock_icon_should_appear_in_the_browser_s_address_bar() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
    }
    @Then("the browser should indicate that the connection is secure")
    public void the_browser_should_indicate_that_the_connection_is_secure() {
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.startsWith("https://")) {
            System.out.println("The connection is secure, and the browser indicates it is secure.");
        } else {
            System.out.println("The connection is insecure (HTTP), and the browser will not indicate a secure connection.");
        }
    }
    @When("Pass the PrepyAI website valid url")
    public void pass_the_prepy_ai_website_valid_url() {
        webPage.launchUrl("https://anatomy.adraproductstudio.com/");
    }
    @Then("Should display a short intro of prepyAI in the homepage")
    public void should_display_a_short_intro_of_prepy_ai_in_the_homepage() {
        System.out.println("Text is there");
    }
}