package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class SigninFunction {
    WebDriver driver;
    WebDriverWait wait;
    public SigninFunction(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void launchUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void clickSignInWithGoogle() {
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }
    public void enterEmail(String email) {
        WebElement mailIdField = driver.findElement(By.id("identifierId"));
        mailIdField.sendKeys(email);
    }
    public void clickNextUnderEmail() {
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    }
    public void enterPassword(String password) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement passwordField = driver.findElement(By.name("Passwd"));
        passwordField.sendKeys(password);
    }
    public void clickNextUnderPassword() {
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
        nextButton.click();
    }
    public void verifyLogin() {
        System.out.println("The user successfully navigated to the PrepyAI subscription plan page");
    }
}
