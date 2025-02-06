package Pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginFeature {
    public WebDriver driver;

    // Constructor to initialize the driver and PageFactory
    public LoginFeature(WebDriver driver) {
        this.driver = driver;
        // Initialize the PageFactory to bind WebElements
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    @FindBy(xpath = "//input[@type='email']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//span[text()='Sign in']")
    private WebElement loginButton;

    // Method to enter the username
    public void enterUsername(String username) {
        userNameField.sendKeys(username);
    }

    // Method to enter the password
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Method to click on the login button
    public void clickLogin() {
        loginButton.click();
    }

    // Combined method to perform login
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
