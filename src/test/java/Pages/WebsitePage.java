package Pages;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
public class WebsitePage {
    WebDriver driver;
    WebsitePage webPage;
    public WebsitePage(WebDriver driver) {
        this.driver = driver;
    }
    public void launchUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void validateURL(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        if (!actualUrl.equals(expectedUrl)) {
            throw new AssertionError("URL validation failed! Expected: " + expectedUrl + ", but got: " + actualUrl);
        }
        System.out.println("URL Validation Passed");
    }
    public void validateTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (!actualTitle.equals(expectedTitle)) {
            throw new AssertionError("Title  validation failed! Expected: " + expectedTitle + ", but got: " + actualTitle);
        }
        System.out.println("Title Validation Passed");
    }
}
