package Step;

import Pages.LoginFeature;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Step.LoginMMH;



//import static org.apache.poi.hssf.record.chart.LegendRecord.dataTable;

public class LoginMMH  {

 public WebDriver driver;
 public LoginFeature loginFeature;
 @Given("user is enter the URL")
    public void userIsEnterTheURL() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://v2webuat.mmh-demo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Login']")).click();
     loginFeature = new LoginFeature(driver);



    }

    @And("Enter the email and password")
    public void enterTheEmailAndPassword() {
        loginFeature.enterUsername("romieojuliet1@mmh-demo.com");  // Pass the username
        loginFeature.enterPassword("Manage@123");  // Pass the password

 }

    @Then("Click the login button")
    public void clickTheLoginButton() {
        loginFeature.clickLogin();

    }


//    Using_Data_from_feature
//
//    @Given("User navigate to websites")
//    public void userNavigateToWebsites() {
//        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://v2webuat.mmh-demo.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("(//span[normalize-space()='Login'])[1]")).click();
//    }
//
//    @When("Enter the Below credentials")
//    public void enterTheBelowCredentials(DataTable dataTable) {
//      List<Map<String,String>>KeyValuePair = dataTable.asMaps(String.class, String.class);
//      String UserName = KeyValuePair.get(0).get("UserName");
//      String Password = KeyValuePair.get(0).get("Password");
//
//      driver.findElement(By.xpath("//input[@type='email']")).sendKeys(UserName);
//      driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
//
//    }
//
//
//    @And("Enter the Login Button")
//    public void enterTheLoginButton() {
//        driver.findElement(By.xpath(("//span[normalize-space()='Sign in']"))).click();
//    }
//
//
//
////    Using Example method
//
//    @Given("Patient enter URL")
//    public void patientEnterURL() {
//        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://v2webuat.mmh-demo.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("(//span[normalize-space()='Login'])[1]")).click();
//    }
//
//    @When("patient enter {string} and {string}")
//    public void patientEnterAnd(String UserName, String Password) {
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(UserName);
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
//
//    }
//
//    @And("click ok button")
//    public void clickOkButton() {
//        driver.findElement(By.xpath(("//span[normalize-space()='Sign in']"))).click();
//    }

}