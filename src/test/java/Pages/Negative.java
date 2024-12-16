package Pages;
import org.openqa.selenium.WebDriver;
public class Negative {
     WebDriver driver;
     public Negative(WebDriver driver){
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
}
